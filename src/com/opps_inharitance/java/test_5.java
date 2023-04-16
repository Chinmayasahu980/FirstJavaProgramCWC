package com.opps_inharitance.java;

public class test_5 extends google
{
    public static void main(String[]args)
    {
        google g = new map("india","loc");

            System.out.println(g.pname);
            System.out.println(g.function);

        google g1 = new photos("my passphoto","jpg");

        System.out.println(g1.pname);
        System.out.println(g1.function);

        google g2 = new chrome("browser","browsing");

        System.out.println(g2.pname);
        System.out.println(g2.function);

    }
}
