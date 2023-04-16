package com.jspyder_opps.java;

public class fruit {
    String colour;
    String name;

    public static void main(String[] args) {
        fruit f1 = new fruit();
        f1.name = "mango";
        f1.colour = "yellow";
        fruit f2 = new fruit();
        f2.name = "orange";
        f2.colour = "orange";
        fruit f3 = new fruit();
        f3.name = "banana";
        f3.colour = "yellow";
        System.out.println(f1.colour);
        System.out.println(f2.colour);
        System.out.println(f1.name);
        System.out.println(f3.name);

    }
}
