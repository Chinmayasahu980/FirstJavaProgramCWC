package com.jspyder_opps.java;

public class opps_marker {


        String brand;
        String colour;
        int price;

        public static void main(String[]args) {
        opps_marker m1=new opps_marker();
        m1.brand="camlin";
        m1.colour="blue";
        m1.price=10;

        opps_marker m2=new opps_marker();
        m2.brand="lencer";
        m2.colour="black";
        m2.price=15;
                System.out.println(m1.price);
                System.out.println(m1.brand);
                System.out.println(m2.price);
                System.out.println(m2.colour);

        }
    }

