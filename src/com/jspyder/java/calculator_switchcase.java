package com.jspyder.java;

public class calculator_switchcase {
    public static void main(String[]args){
        int n1 = 45;
        int n2 = 52;
        int option=2;
        switch(option)
        {
            case 1 :
            {
                System.out.println(n1+n2);
            }
            break;
            case 2:
            {
                System.out.println(n1-n2);
            }
            break;
            case 3:
            {
                System.out.println(n1*n2);
            }
            break;
            case 4:
            {
                System.out.println(n1/n2);
            }
            break;
            default :
            {
                System.out.println("enter a valid number");
            }
            break;
        }
    }
}
