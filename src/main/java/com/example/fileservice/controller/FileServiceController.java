package com.example.fileservice.controller;

import com.example.fileservice.entity.FileEntity;
import com.example.fileservice.service.FileServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

import java.nio.file.NoSuchFileException;
import java.util.List;

@RestController
@RequestMapping("/api")
public class FileServiceController {

    @Autowired
    private FileServiceImpl fileService;

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @GetMapping("/all")
    public List<FileEntity> getAll() throws NoSuchFileException {
        return fileService.getAllFolders();
    }

    @GetMapping("/list-files/{folderName}")
    public List<FileEntity> getFilesOfFolder(@PathVariable String folderName) {
        return fileService.getAllFilesInFolder(folderName);
    }

    @PostMapping("/send-file")
    public FileEntity sendFileToKafka(@RequestBody FileEntity file) {
        if (file.getAbsolutePath() == null) {
            String absolutePath = fileService.getAbsolutePathOfFile(file.getName());
            file.setAbsolutePath(absolutePath);
        }
        kafkaTemplate.send("files-topic", file.getAbsolutePath());
        return file;
    }
}
