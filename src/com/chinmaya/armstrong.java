/*
5) WAP to check whether the number is Armstrong number or not .
*/
package com.chinmaya;
import java.util.Scanner;
public class armstrong {
    public static void main(String[] args)
    {
        int number,check, r;
    int  sum = 0;
       System.out.println("Enter the number:");
    Scanner sc = new Scanner(System.in);
    number = sc.nextInt();
    check = number;
      while(check != 0) {
        r = check % 10;
        sum = sum + (r * r * r);
        check = check / 10;
    }
      if(sum == number)
            System.out.println("this number is armstrong number");
      else
              System.out.println("tha number is not an armstrong number");
}
}