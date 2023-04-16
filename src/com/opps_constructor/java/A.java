package com.opps_constructor.java;

public class A {
    static {
        System.out.println("sb");
    }
    {
        System.out.println("sb-1");
    }
    {
        System.out.println("sb-2");
    }
    public A()
    {

    }
    public static void main(String[]args)
    {
        A a1 = new A();
        A a2 = new A();
        A a3 = new A();
    }

}
