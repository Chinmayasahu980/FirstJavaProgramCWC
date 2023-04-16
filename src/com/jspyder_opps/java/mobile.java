package com.jspyder_opps.java;

public class mobile {
    String brand;
    String model;
    int ram;

    public void aboutphone()
    {
        System.out.println(brand);
        System.out.println(model);
        System.out.println(ram);
    }
    public static void main(String[]args){
        mobile m1 = new mobile();
        m1.brand = "i phone";
        m1.model = "13 pro max";
        m1.ram = 8;
        mobile m2 = new mobile();
        m2.brand ="realme";
        m2.model = "x7 pro";
        m2.ram = 8;

        m1.aboutphone();
        m2.aboutphone();
    }
}
