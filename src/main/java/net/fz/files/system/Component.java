package net.fz.files.system;

public abstract class Component {
    protected String name;
    protected int level; // pour gerer la hierarchie

    public Component(String name) {
        this.name = name;
        this.level = 0;
    }
    public abstract void print();

    protected String tabs(){
        String tabs = "";
        for(int i=0;i<level;i++){
            tabs += "\t";
        }
        return tabs;
    }
}

