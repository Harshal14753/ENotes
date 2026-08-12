package com.notes.service;

import java.io.IOException;
import java.io.InputStream;

import org.springframework.web.multipart.MultipartFile;

public interface S3Service {

    String uploadFile(MultipartFile file, String userEmail) throws IOException;

    void deleteFile(String key);

    InputStream downloadFile(String key);
}
