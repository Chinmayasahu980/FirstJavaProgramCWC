package com.chinmaya;
import java.util.Scanner;
public class name_rollno {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int  roll;
     String name;
        System.out.println("enter your Roll no:");
        roll = sc.nextInt();
        sc.nextLine();
        System.out.println("enter your name :");
        name = sc.nextLine();
        System.out.print("your roll no is:   ");
        System.out.println(roll);
        System.out.print("your name is:   ");
        System.out.print(name);
    }
}
