package com.opps_constructor.java;

public class appform {
    String name;
    double cno;
    double alcno;

    public appform(String name)
    {
        this.name =name;
    }
    public appform( String name,double cno)
    {
        this.name = name;
        this.cno = cno;
    }
    public appform( String name,double cno,double alcno)
    {
        this.name = name;
        this.cno = cno;
        this.alcno = alcno;
    }
    public void appformdetails(){
        System.out.println(name);
        System.out.println(cno);
        System.out.println(alcno);
    }
    public static void main(String[]args)
    {
        appform a1 = new appform("chinmaya",8847871971l,9438399589l);
        appform a2 = new appform("chinu",8847971l,9438399l);

        a1.appformdetails();
        a2.appformdetails();
    }
}
