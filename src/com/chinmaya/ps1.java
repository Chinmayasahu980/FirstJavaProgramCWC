package com.chinmaya;
import java.util.Scanner;
public class ps1 {
    public static void main(String[] args) {
        int a,b,c,cgpa;
        Scanner in = new Scanner(System.in);
        System.out.println("enter your physics mark");
        a=in.nextInt();
        System.out.println("enter your chemistrys mark");
        b=in.nextInt();
        System.out.println("enter your math mark");
        c=in.nextInt();
        cgpa=(a+b+c)/30;
        System.out.println(cgpa);
 }
}
