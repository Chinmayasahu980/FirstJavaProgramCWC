package com.chinmaya;

import java.util.Scanner;
public class xyz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your sallary");
        int sallary = sc.nextInt();
        if (250000f > sallary) {
            float a = (sallary * 0.0f);
            System.out.println("your income tax amount is");
            System.out.print(a);
        } else if (250000 < sallary && 500000 > sallary) {
            float b = (sallary * 0.05f);
            System.out.println("your income tax amount is");
            System.out.print(b);
        } else if (250000 < sallary && 500000 > sallary) {
            float c = (sallary * 0.20f);
            System.out.println("your income tax amount is");
            System.out.print(c);
        } else if (500000 < sallary && 1000000 > sallary) {
            float d = (sallary * 0.30f);
            System.out.println("your income tax amount is");
            System.out.print(d);
        }
        else {
        }
        System.out.println("   you are pay tax to govt");
    }
}