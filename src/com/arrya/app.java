package com.arrya;

public class app {
    String name;
    double size;
    public app(String name,double size)
    {
        this.name = name;
        this.size = size;
    }
    @Override
    public String toString()
    {
        return name;
    }
}
