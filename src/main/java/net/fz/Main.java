package net.fz;

import net.fz.files.system.Folder;

import net.fz.files.system.File;
public class Main {
    public static void main(String[] args) {
        Folder root=new Folder("root");
        root.addChild(new File("pom.xml"));
        root.addChild(new File(".gitignore"));

        Folder src=(Folder) root.addChild(new Folder("src"));
        src.addChild(new File("test.ma"));

        root.print();


    }
}