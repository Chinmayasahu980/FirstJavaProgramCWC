package com.jspyder.java;
import java.util.Scanner;
public class switch_case1 {
    public static void main(String[]args){
        System.out.println("Enter the Colour:");
        Scanner sc = new Scanner(System.in);
        String pen = sc.next();
        switch(pen)
            {
            case "white" :
            {
                System.out.println("white");
            }
            case "black" :
            {
                System.out.println("black");
            }
            case "blue" :
            {
                System.out.println("blue");
            }
            case "red" :
            {
                System.out.println("red");
            }
            case "green" :
            {
                System.out.println("green");
            }
            defult :
            {
                System.out.println("defult");
            }
        }

    }
}
