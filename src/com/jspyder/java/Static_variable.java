package com.jspyder.java;

public class Static_variable {
    static int a =15;
    public static void main(String[]args){

        int a =15;
        System.out.println(a);
        m1();
    }
    public static void m1(){

        System.out.println(a*a);
    }
}
