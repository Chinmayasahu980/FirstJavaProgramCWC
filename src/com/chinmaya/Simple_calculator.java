/*
2) Design a simple calculator using switch case for the following operators +, -, *, /, %  .
*/
package com.chinmaya;
import java.util.Scanner;
public class Simple_calculator {
    public static void main(String[] args) {
      char opt;
      int a,b;
      int c = 0;
      Scanner input = new Scanner(System.in);
        System.out.println("choose any one operator:\n +,-,*,or /  ");
        opt = input.next().charAt(0);
        System.out.println("enter tha first number");
        a = input.nextInt();
        System.out.println("enter tha second number");
        b = input.nextInt();
        switch (opt)
        {
            case '+': c = a + b;
            break;
            case '-': c = a - b;
            break;
            case '*': c = a * b;
            break;
            case '/': c = a / b;
            break;
            default:
            System.out.println("invalid operator");
            break;
        }
        System.out.println(a + " " + opt + " " + b + " = " + c);
    }
}
