package com.notes.service;

import org.springframework.web.multipart.MultipartFile;

import java.util.Map;

public interface ImageService {

    public Map uploadImage(MultipartFile file);

}
