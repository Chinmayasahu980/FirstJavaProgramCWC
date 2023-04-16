/*1) WAP to print the reverse of a number.
        Input: 20003
        Outout: 30002
*/
package com.chinmaya;
import java.util.Scanner;
public class reverse {
    public static void main(String[] args) {
        int n, r=0,rem;
        System.out.println("Enter a number");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        while(n != 0)
        {
            rem=n%10;
            r=r*10+rem;
            n=n/10;
        }
        System.out.println("Reverse of the number is " + r);

    }
}
