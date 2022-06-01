package com.academiaDigital.softwareArchitecture;

import java.util.ArrayList;
import java.util.List;

public class Folder implements  IPathProvider {
    private List<IPathProvider> files = new ArrayList<>();
    private String folder;

    public Folder(String folder) {
        this.folder = folder;
    }

    @Override
    public String getPath() {
        String pathResult="";
        for (IPathProvider path:files) {
            pathResult=this.folder+pathResult+path.getPath() + "\n";
        }
        return pathResult;
    }
    public void addFile(IPathProvider file){
        files.add(file);
    }
}
