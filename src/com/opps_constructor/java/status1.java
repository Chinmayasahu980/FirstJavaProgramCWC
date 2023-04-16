package com.opps_constructor.java;

public class status1
{
    String name;
    float time;
    int view;
    public status1(String name,float time,int view)
    {
        this.name = name;
        this.time = time;
        this.view = view;
    }
    public void details()
    {
        System.out.println(name);
        System.out.println(time);
        System.out.println(view);
    }
    public static void main(String[]args)
    {
        status1 s1 = new status1("hii",12.35f,89);
        s1.details();
        status1 s2 = new status1("good morning",7.30f,55);
        s2.details();
    }
}
