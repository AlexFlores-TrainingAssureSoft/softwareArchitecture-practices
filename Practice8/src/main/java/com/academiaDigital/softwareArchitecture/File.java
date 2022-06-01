package com.academiaDigital.softwareArchitecture;

public class File implements IPathProvider{
    private String path;

    public File(String path) {
        this.path = path;
    }

    @Override
    public String getPath() {
        return path;
    }
}
