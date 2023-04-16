package com.jspyder_opps.java;

public class car {
    String brand;
    int cc;
    double price;

    public static void main(String[]args)
    {
        car c1 = new car ();
        c1.brand="hundai";
        c1.cc = 2134;
        c1.price= 1254685l;

        car c2 = new car();
        c2.brand = "honda";
        c2.cc = 5200;
        c2.price = 2000000l;

        car c3 = new car();
        c3.brand = "bmw";
        c3.cc=2503;
        c3.price = 3500000l;
        System.out.println(c3.brand);
}}
