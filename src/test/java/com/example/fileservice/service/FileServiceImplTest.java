package com.example.fileservice.service;

import com.example.fileservice.entity.FileEntity;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.nio.file.NoSuchFileException;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = { FileServiceImpl.class })
public class FileServiceImplTest {

    @Autowired
    private FileServiceImpl fileService;

    @Test
    public void getAllFolders_testCorrectRoot() {
        try {
            List<FileEntity> foldersList = fileService.getAllFolders();
            Assert.assertFalse("File storage is empty", foldersList.isEmpty());
        } catch (NoSuchFileException e) {
            Assert.fail("Couldn't get all folders");
            e.printStackTrace();
        }
    }

    @Test
    public void getAllFilesInFolder_testCorrectFolder() {
        final String folder = "folder1";

        try {
            List<FileEntity> foldersList = fileService.getAllFilesInFolder(folder);
            Assert.assertFalse("No files in the subfolder", foldersList.isEmpty());
        } catch (NoSuchFileException e) {
            Assert.fail("Couldn't get files in the subfolder");
            e.printStackTrace();
        }
    }

    @Test
    public void getAllFilesInFolder_testIncorrectFolder() {
        final String folder = "folder1412414%#@!";

        try {
            List<FileEntity> foldersList = fileService.getAllFilesInFolder(folder);
            Assert.assertTrue("Found specified folder", foldersList.isEmpty());
        } catch (NoSuchFileException e) {
            Assert.assertEquals("Couldn't find specified folder", e.getMessage());
        }
    }

    @Test
    public void getAbsolutePathOfFile_tesCorrectFile() {
        final String fileName = "file1.txt";

        String absolutePath = fileService.getAbsolutePathOfFile(fileName);
        Assert.assertFalse("Specified file not found", absolutePath.isEmpty());

    }

    @Test
    public void getAbsolutePathOfFile_tesIncorrectFile() {
        final String fileName = "file1gadgas%#@GFAGAGWGag.xpp";

        String absolutePath = fileService.getAbsolutePathOfFile(fileName);
        Assert.assertTrue("Found specified file", absolutePath.isEmpty());

    }
}
