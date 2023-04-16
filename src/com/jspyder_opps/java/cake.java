package com.jspyder_opps.java;

public class cake {
    String name;
    String flavour;
    int price;
    public void initialize(String name,String flavour,int price)
    {
        this.name = name;
        this.flavour= flavour;
        this.price = price;

    }
    public void cakedetails()
    {
        System.out.println(name);
        System.out.println(flavour);
        System.out.println(price);
    }
    public static void main(String []args){
        cake c1 = new cake();
        c1.initialize("red velvate","strawbarry",650);
        c1.cakedetails();
    }

}
