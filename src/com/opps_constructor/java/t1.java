package com.opps_constructor.java;

public class t1 {
    public static void main(String[] args) {
        equal q1 = new equal("leila",456);
        equal q2 = new equal("shella",789);
        equal q3 = new equal("leila",456);
        System.out.println(q1==q2);
        System.out.println(q1.equals(q2));
        System.out.println(q1==q3);
        System.out.println(q1.equals(q3));
    }
}
