package com.jspyder.java;
import java.util.Scanner;
public class switchcase2_break {
public static void main(String[]args){
    System.out.println("Enter a colour");
    Scanner sc = new Scanner(System.in);
    String colour = sc.next();
        switch(colour)
        {
            case "white" :
            {
                System.out.println("white give energy");
            }
            break;
            case "black":
            {
                System.out.println("black is dark energy");
            }
            break;
            case "blue" :
            {
                System.out.println("blue is my fev colour");
            }
            break;
            case "red" :
            {
                System.out.println("red is a sexy colour");
            }
            break;
            case "orange" :
            {
                System.out.println("orange is a mg colour");
            }
            default :
            {
                System.out.println("geide"  );
            }

        }

    }
}
