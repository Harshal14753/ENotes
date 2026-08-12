package com.notes.controller;

import com.notes.repository.NotesRepository;

import java.io.InputStream;
import java.security.Principal;
import java.time.LocalDate;
import java.util.List;

import com.notes.service.JwtService;
import com.notes.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import com.notes.entity.Notes;
import com.notes.entity.User;
import com.notes.repository.UserRepo;
import com.notes.service.NotesServicesImpl;
import com.notes.service.S3Service;

import jakarta.servlet.http.HttpSession;

@RestController
@RequestMapping("/api/user")
@CrossOrigin("http://localhost:5173")
public class UserController {

	private final NotesRepository notesRepository;

	@Autowired
	private UserRepo userRepo;

	@Autowired
	private S3Service s3service;

	@Autowired
	private NotesServicesImpl notesService;

	@Autowired
	private UserServiceImpl userServiceImpl;

	@Autowired
	private JwtService jwtService;

	UserController(NotesRepository notesRepository) {
		this.notesRepository = notesRepository;
	}

	private String getOriginalFileName(String s3Key) {

		String fileName = s3Key.substring(s3Key.lastIndexOf("/") + 1);

		int dashIndex = fileName.indexOf("-");

		if (dashIndex != -1) {
			return fileName.substring(dashIndex + 1);
		}

		return fileName;
	}

	@GetMapping("/viewNotes")
	public ResponseEntity<List<Notes>> viewNotes(Principal p) {
		User user = userServiceImpl.getUserByEmail(p.getName());
		List<Notes> notesList = notesService.getNotesByUser(user);
		return ResponseEntity.ok(notesList);
	}

	@GetMapping("/editNotes/{id}")
	public String editNotes(@PathVariable int id, Model m) {
		Notes notes = notesService.getNotesById(id);
		m.addAttribute("n", notes);
		return "editNotes";
	}

	@GetMapping("/note/{id}")
	public ResponseEntity<Notes> getNote(@PathVariable int id) {
		Notes notes = notesService.getNotesById(id);
		return ResponseEntity.ok(notes);
	}

	@PostMapping(value = "/file/saveNotes", consumes = { "multipart/form-data" })
	public ResponseEntity<String> saveNotes(
			@RequestParam("title") String title,
			@RequestParam("description") String description,
			@RequestParam("userEmail") String userEmail,
			@RequestParam(value = "file", required = false) MultipartFile file) {

		if (file == null || file.isEmpty()) {

			return ResponseEntity
					.badRequest()
					.body("Please select a file to upload");
		}

		try {

			// Find user
			User user = userRepo.findByEmail(userEmail);

			if (user == null) {

				return ResponseEntity
						.badRequest()
						.body("User not found");
			}

			/*
			 * Upload file to S3
			 *
			 * Example returned key:
			 *
			 * harshal@gmail.com/
			 * UUID-java.pdf
			 */
			String s3Key = s3service.uploadFile(
					file,
					user.getEmail());

			// Create Notes object
			Notes notes = new Notes();

			notes.setTitle(title);
			notes.setDescription(description);
			notes.setDate(LocalDate.now());
			notes.setUser(user);

			// Store S3 key in database
			notes.setFileName(s3Key);

			// Save note in database
			Notes savedNotes = notesService.saveNotes(notes);

			if (savedNotes != null) {

				return ResponseEntity.ok(
						"Notes added successfully");
			}

			/*
			 * If database save fails,
			 * remove the uploaded S3 file.
			 */
			s3service.deleteFile(s3Key);

			return ResponseEntity
					.badRequest()
					.body("Something went wrong");

		} catch (IllegalArgumentException e) {

			return ResponseEntity
					.badRequest()
					.body(e.getMessage());

		} catch (Exception e) {

			e.printStackTrace();

			return ResponseEntity
					.status(HttpStatus.INTERNAL_SERVER_ERROR)
					.body("File upload failed");
		}
	}

	@GetMapping("/deleteNotes/{id}")
	public ResponseEntity<String> deleteNotes(
			@PathVariable int id) {

		boolean isDelete = notesService.deleteNotes(id);

		if (isDelete) {

			return ResponseEntity.ok(
					"Notes deleted successfully");
		}

		return ResponseEntity
				.badRequest()
				.body("Something went wrong");
	}

	@GetMapping("/file/{id}")
	public ResponseEntity<InputStreamResource> getFile(
			@PathVariable int id) {

		try {

			Notes notes = notesService.getNotesById(id);

			if (notes == null) {

				return ResponseEntity
						.notFound()
						.build();
			}

			String s3Key = notes.getFileName();

			InputStream inputStream = s3service.downloadFile(s3Key);

			InputStreamResource resource = new InputStreamResource(inputStream);

			return ResponseEntity.ok()
					.header(
							HttpHeaders.CONTENT_DISPOSITION,
							"inline; filename=\"" +
									getOriginalFileName(s3Key) +
									"\"")
					.contentType(
							MediaType.APPLICATION_OCTET_STREAM)
					.body(resource);

		} catch (Exception e) {

			e.printStackTrace();

			return ResponseEntity
					.status(HttpStatus.INTERNAL_SERVER_ERROR)
					.build();
		}
	}
}