package com.chinmaya;
import java.util.Scanner;
public class cbsemarkpercentage
    {
        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter your math mark");
            int a = sc.nextInt();
            System.out.println("enter your physics mark");
            int b = sc.nextInt();
            System.out.println("enter your chemistry mark");
            int c = sc.nextInt();
            System.out.println("enter your biology mark");
            int d = sc.nextInt();
            System.out.println("enter your english mark");
            int e = sc.nextInt();
            int percentage = (a+b+c+d+e)/5;
            System.out.println(percentage);

        }
    }
