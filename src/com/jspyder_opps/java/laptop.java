package com.jspyder_opps.java;

public class laptop {
    String brand;
    int ram;
    int price;
    public static void main(String[]args){
        laptop l1 = new laptop();
        l1.brand = "lenovo";
        l1.ram = 8;
        l1.price = 40000;
        laptop l2 = new laptop();
        l2.brand = "hp";
        l2.price = 60000;
        l2.ram = 16;
        System.out.println(l1.brand);
        System.out.println(l1.ram);
        System.out.println(l2.brand);
        System.out.println(l2.price);
        System.out.println(l2.ram);
    }


}
