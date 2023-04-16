package com.jspyder.java;

public class arithmatic {
    public static void main(String[] args) {
        int a = 25;
        int b = 26;
        int c = a + b;

        float d = 45.455f;
        float e = 56.3245f;
        float f = d - e;

        long g = 4523625;
        long h = 452826;
        long i = g * h;

        int j = 45;
        int k = 6;
        int l = j / k;
        int m = j%k;
        System.out.println(c);
        System.out.println(f);
        System.out.println(i);
        System.out.println(l);
        System.out.println("m is"+m);
        System.out.println("tha sum of" +a+ "and" +b+ "is"+c);
     System.out.println("tha substraction of "+d+ "from"+e+"is"+f);
        System.out.println("tha multiply of "+g+"and"+h+"is"+i);
        System.out.println("tha devied of " +j+"and"+k+"is"+l);
    }
}