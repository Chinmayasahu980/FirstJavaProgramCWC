package com.jspyder.java;

public class file_chaining {
    String name;
    String extension;
    double size;

    public file_chaining(String name)
    {
        this.name = name;
    }
    public file_chaining(String name,String extension)
    {
        this(name);
        this.extension = extension;
    }
    public file_chaining(String name,String extension,double size)
    {
        this(name,extension);
        this.size=size;
    }

}
