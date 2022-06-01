package com.academiaDigital.softwareArchitecture;

import java.util.ArrayList;
import java.util.List;

public class PathProvider implements  IPathProvider {
    private List<IPathProvider> paths = new ArrayList<>();


    @Override
    public String getPath() {
        String pathResult="";
        for (IPathProvider path:paths) {
            pathResult = pathResult + path.getPath() + "\n";
        }
        return pathResult;
    }
    public void addFile(IPathProvider file){
        paths.add(file);
    }
}
