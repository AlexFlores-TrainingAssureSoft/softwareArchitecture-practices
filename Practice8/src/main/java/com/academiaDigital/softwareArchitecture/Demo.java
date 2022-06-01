package com.academiaDigital.softwareArchitecture;

public class Demo {
    public static void main(String[] args) {
        IPathProvider demoFile = new File("demo.jar");
        IPathProvider abcJava = new File("abc.jar");
        IPathProvider coteJava = new File("cote.jar");
        IPathProvider singletonJava = new File("singleton.jar");

        Folder demo = new Folder("Demo");
        demo.addFile(demoFile);


        Folder logic = new Folder("Logic");
        logic.addFile(abcJava);
        logic.addFile(coteJava);
        logic.addFile(singletonJava);

        Folder home = new Folder("Home");
        home.addFile(demo);
        home.addFile(logic);
        System.out.println(home.getPath());
    }
}
