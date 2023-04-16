package com.jspyder_opps.java;

public class opps_laptop {
    String brand;
    int ram;
    int price;

    public static void main(String[]args){

        opps_laptop l1 =new opps_laptop();
        l1.brand="hp";
        l1.ram=8;
        l1.price=50000;

        opps_laptop l2=new opps_laptop();
        l2.brand="dell";
        l2.ram=8;
        l2.price=40000;

        opps_laptop l3= new opps_laptop();
        l3.brand="lenovo";
        l3.ram=16;
        l3.price=60000;

        System.out.println(l1.brand);
        System.out.println(l1.price);
        System.out.println(l2.brand);
        System.out.println(l2.price);
        System.out.println(l3.brand);
        System.out.println(l3.price);
        System.out.println(l3.ram);


    }
}
