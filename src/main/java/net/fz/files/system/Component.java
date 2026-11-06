package net.fz.files.system;

public abstract class Component {
    protected String name;
    protected int level; // pour gerer la hierarchie

    public Component(String name) {
        this.name = name;
        this.level = 0;
    }
    public abstract void print();
}

