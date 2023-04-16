//4) WAP to check for the LEAP Year or not using ternary/Conditional operator.

package com.chinmaya;
import java.util.Scanner;
public class leap_year {
    public static void main(String[] args) {
        int y;
        Scanner sc=new Scanner(System.in);
        System.out.println("Please Enter year for check leap: ");
        y=sc.nextInt();

        String leap=(y%4==0 || y%100==0 && y%400==0)? "The entered year is a leap year":"This is not a leap year";
        System.out.println(leap);

    }
}
