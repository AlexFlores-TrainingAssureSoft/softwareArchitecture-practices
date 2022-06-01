package com.academiaDigital.softwareArchitecture;

public class Demo {
    public static void main(String[] args) {
        IPathProvider javaFile = new File("demo.jar");
        IPathProvider abcJava = new File("abc.jar");
        IPathProvider javaFile1 = new File("cote.jar");
        IPathProvider abcJava1 = new File("singleton.jar");

        Folder dir1 = new Folder("dir1");
        dir1.addFile(javaFile);
        dir1.addFile(abcJava);

        Folder dir2 = new Folder("dir2");
        dir2.addFile(javaFile1);
        dir2.addFile(abcJava1);

        Folder dirMain = new Folder("dirMain");
        dirMain.addFile(dir1);
        dirMain.addFile(dir2);
        System.out.println(dirMain.getPath());
    }
}
