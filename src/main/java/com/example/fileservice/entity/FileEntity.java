package com.example.fileservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class FileEntity {
    private String name;
    private String absolutePath;
}
