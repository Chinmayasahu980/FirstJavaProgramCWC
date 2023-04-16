package com.opps_constructor.java;

public class whatsapp {
    String name;
    int cnum;
    public whatsapp(String name,int cnum)
    {
        this.name = name;
        this.cnum = cnum;
    }
    public void details()
    {
        System.out.println(name);
        System.out.println(cnum);
    }
    public static void main(String[]args)
    {
        whatsapp w1 = new whatsapp("chinmaya",88478771);
        w1.details();
        whatsapp w2 = new whatsapp("rahul",79785554);
        w2.details();
    }
}
