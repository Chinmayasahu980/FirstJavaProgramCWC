package com.jspyder.java;

public class leap_year {
    public static void main(String[]args){
        int year = 1500;
        if ((year%4==0 && year%100!=0)|| year%400==0)
        {
            System.out.println(year + "is a leap year");
        }
        else
        {
            System.out.println(year + "is not a leap year");
        }
    }
}
