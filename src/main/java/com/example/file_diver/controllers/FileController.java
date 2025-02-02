package com.example.file_diver.controllers;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.file_diver.services.FileService;

@RestController
@RequestMapping(path = "files")
public class FileController {
    @Autowired
    FileService fileService ;
    
    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @PostMapping(path = "upload/{userId}")
    public ResponseEntity<?> uploadFile (@RequestParam MultipartFile file, @PathVariable Long userId) throws IOException{
        System.out.println(file);
        return fileService.saveFile(file, userId);
    }

    
}
