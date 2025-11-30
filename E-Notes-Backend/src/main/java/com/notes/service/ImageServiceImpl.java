package com.notes.service;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.Map;

@Service
public class ImageServiceImpl implements ImageService {

    @Autowired
    private Cloudinary cloudinary;

    @Override
    public Map uploadImage(MultipartFile file) {
        try {
            // Determine file type
            String contentType = file.getContentType();
            String resourceType = (contentType != null && contentType.startsWith("image"))
                    ? "image"
                    : "raw"; // for PDFs, docs, etc.

            // Upload file
            Map uploadResult = cloudinary.uploader().upload(
                    file.getBytes(),
                    ObjectUtils.asMap(
                            "resource_type", resourceType,
                            "folder", "E-Notes",
                            "public_id", file.getOriginalFilename(),
                            "use_filename", true,       // keep original name (like notes.pdf)
                            "unique_filename", false,
                            "format", "pdf",
                            "type", "upload"
                    )
            );

            return uploadResult;

        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("File upload failed: " + e.getMessage());
        }
    }
}
