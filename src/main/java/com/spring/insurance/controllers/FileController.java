package com.spring.insurance.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

@Controller
@RequestMapping("/files")
public class FileController {

    private final Logger logger = Logger.getLogger(FileController.class.getName());
    private static final String LOCAL_DIRECTORY = "/docs";

    @PostMapping("/upload")
    public String uploadFile(@RequestParam("file") MultipartFile file) throws IOException {
        Path filePath = Paths.get(LOCAL_DIRECTORY, file.getOriginalFilename());
        Files.copy(file.getInputStream(), filePath, StandardCopyOption.REPLACE_EXISTING);
        return "File uploaded successfully!";
    }

    @GetMapping("/list")
    public String listFiles(Model model) {
        File folder = new File(LOCAL_DIRECTORY);
        File[] files = folder.listFiles();
        List<String> fileNames = new ArrayList<>();
        if (files != null) {
            for (File file : files) {
                fileNames.add(file.getName());
            }
        }
        model.addAttribute("fileNames", fileNames);
        return "fileManager";
    }


    // Download a file from the local directory
    @GetMapping("/download/{fileName}")
    public byte[] downloadFile(@PathVariable String fileName) throws IOException {
        Path filePath = Paths.get(LOCAL_DIRECTORY, fileName);
        return Files.readAllBytes(filePath);
    }

    // Delete a file from the local directory
    @DeleteMapping("/delete/{fileName}")
    public String deleteFile(@PathVariable String fileName) {
        Path filePath = Paths.get(LOCAL_DIRECTORY, fileName);
        try {
            Files.deleteIfExists(filePath);
            return "File deleted successfully!";
        } catch (IOException e) {
            return "Failed to delete the file.";
        }
    }
}
