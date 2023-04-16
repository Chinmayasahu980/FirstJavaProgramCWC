package com.opps_constructor.java;

public class test1 {
    public static void main(String[]args)
    {
        status s1 = new status("chinmaya");
        status s2 = new status("chinmaya","12.35pm");
        status s3 = new status("chinmaya","12.35pm",250);

        s1.statusdetails();
        s2.statusdetails();
        s3.statusdetails();

    }
}
