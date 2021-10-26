package com.example.fileservice.service;

import com.example.fileservice.FileEntityProto;
import com.example.fileservice.entity.FileEntity;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.io.File;
import java.nio.file.NoSuchFileException;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class FileServiceImpl implements FileService {

    @Value("${storage.directory.name}")
    private String storageName;

    private String storageDirectory;

    private File storage;

    @PostConstruct
    private void defineStorageDirectory() {
        this.storageDirectory = System.getProperty("user.dir") + "\\" + storageName;
        this.storage = new File(storageDirectory);

    }

    public List<FileEntity> getAllFolders() throws NoSuchFileException {

        if (this.storage != null) {
            return Stream.of(storage.listFiles())
                    .filter(File::isDirectory)
                    .map(file -> new FileEntity(file.getName(), file.getAbsolutePath()))
                    .collect(Collectors.toList());
        } else {
            throw new NoSuchFileException("Couldn't find file storage");
        }
    }

    public List<FileEntity> getAllFilesInFolder(String folderName) {
        String filePathToCheck = this.storageDirectory + "\\" + folderName;
        File folderWithFiles = new File(filePathToCheck);

        if (folderWithFiles != null) {
            return Stream.of(folderWithFiles.listFiles())
                    .filter(File::isFile)
                    .map(file -> new FileEntity(file.getName(), file.getAbsolutePath()))
                    .collect(Collectors.toList());
        } else {
            return Collections.emptyList();
        }
    }

    public String getAbsolutePathOfFile(String fileName) {

        Collection<File> files = FileUtils.listFiles(storage, null, true);

        for (File file : files) {
            if (file.getName().equals(fileName)) {
                return file.getAbsolutePath();
            }
        }

        return "";
    }

    public FileEntityProto.FileEntity convertEntityToProtobuf(FileEntity entity) {

        return FileEntityProto.FileEntity.newBuilder()
                .setAbsolutePath(entity.getAbsolutePath())
                .setFileName(entity.getName())
                .build();
    }

    public String getRootDirectory() {
        return storageDirectory;
    }
}
