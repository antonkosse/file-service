package com.example.fileservice.controller;

import com.example.fileservice.FileEntityProto;
import com.example.fileservice.entity.FileEntity;
import com.example.fileservice.service.FileServiceImpl;
import com.example.fileservice.service.KafkaCommunicationService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

import java.nio.file.NoSuchFileException;
import java.util.List;

@RestController
@RequestMapping("/api")
@Tag(name = "File service controller", description = "Controller responsible for the main operations with file storage")
public class FileServiceController {

    @Autowired
    private FileServiceImpl fileService;

    @Autowired
    private KafkaCommunicationService kafkaService;

    @Operation(summary = "Get all folders in the root of file storage")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200",
                    description = "Listed all available folders in the root directory.",
                    content = {
                            @Content(mediaType = "application/json",
                                    array = @ArraySchema(schema = @Schema(implementation = FileEntity.class)))
                    }),
            @ApiResponse(responseCode = "500", description = "Couldn't list folders.")
    })
    @GetMapping("/all")
    public List<FileEntity> getAll() throws NoSuchFileException {
        return fileService.getAllFolders();
    }

    @Operation(summary = "Get all files in the specific folder of the file storage")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200",
                    description = "Listed all available files in the subfolder.",
                    content = {
                            @Content(mediaType = "application/json",
                                    array = @ArraySchema(schema = @Schema(implementation = FileEntity.class)))
                    }),
            @ApiResponse(responseCode = "500", description = "Couldn't list files in the subfolder.")
    })
    @GetMapping("/list-files/{folderName}")
    public List<FileEntity> getFilesOfFolder(@PathVariable String folderName) throws NoSuchFileException {
        return fileService.getAllFilesInFolder(folderName);
    }

    @Operation(summary = "Send file from the storage to the kafka")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200",
                    description = "Successfully sent file absolute path to kafka.",
                    content = {
                            @Content(mediaType = "application/x-protobuf",
                                    schema = @Schema(implementation = FileEntityProto.FileEntity.class))
                    }),
            @ApiResponse(responseCode = "500", description = "Couldn't send file to kafka.")
    })
    @PostMapping("/send-file")
    public FileEntityProto.FileEntity sendFileToKafka(@RequestBody FileEntity file) {
        if (file.getAbsolutePath() == null) {
            String absolutePath = fileService.getAbsolutePathOfFile(file.getName());
            file.setAbsolutePath(absolutePath);
        }

        FileEntityProto.FileEntity protoEntity = fileService.convertEntityToProtobuf(file);
        kafkaService.sendProtobufToTopic(protoEntity);
        return protoEntity;
    }
}
