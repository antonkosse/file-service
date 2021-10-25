package com.example.fileservice.entity;

public class FileEntity {
    private String name;
    private String absolutePath;

    public FileEntity(String name, String absolutePath) {
        this.name = name;
        this.absolutePath = absolutePath;
    }

    public String getName() {
        return name;
    }

    public String getAbsolutePath() {
        return absolutePath;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAbsolutePath(String absolutePath) {
        this.absolutePath = absolutePath;
    }

    @Override
    public String toString() {
        return "FileEntity{" +
                "name='" + name + '\'' +
                ", absolutePath='" + absolutePath + '\'' +
                '}';
    }
}
