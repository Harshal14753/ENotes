package com.notes.service;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.notes.controller.UserController;
import com.notes.entity.Notes;
import com.notes.entity.User;
import com.notes.repository.NotesRepository;

@Service
public class NotesServicesImpl implements NotesService{

	@Autowired
	private NotesRepository notesRepository;

	@Autowired
	private ImageServiceImpl imageService;

	private static final String BASE_DIRECTORY = "C:/Users/Harshal PC/Desktop/.vscode/Spring Boot/Project/Major-Project/E-Notes/ENotes-Data";


	@Override
	public Notes saveNotes(Notes notes) {
		return notesRepository.save(notes);
	}

	@Override
	public Notes getNotesById(int id) {
		return notesRepository.findById(id).get();
	}

	@Override
	public Notes updateNotes(Notes notes) {
		return notesRepository.save(notes);
	}

	@Override
	public boolean deleteNotes(int id) {

		try {
			notesRepository.deleteById(id);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public List<Notes> getNotesByUser(User user) {
		return notesRepository.findByUser(user);
	}

	
	
	
}
