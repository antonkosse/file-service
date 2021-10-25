package com.example.fileservice.service;

import com.example.fileservice.entity.FileEntity;

import java.nio.file.NoSuchFileException;
import java.util.List;

public interface FileService {

    List<FileEntity> getAllFolders() throws NoSuchFileException;

    List<FileEntity> getAllFilesInFolder(String folderName);

    String getAbsolutePathOfFile(String fileName);

}
