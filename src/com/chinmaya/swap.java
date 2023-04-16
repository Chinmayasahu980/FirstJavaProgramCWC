//2) WAP to swap 3 numbers without using the temporary variable.

package com.chinmaya;
import java.util.Scanner;
public class swap {
    public static void main(String[] args) {
        int a,b,c;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter numbers");
        a=in.nextInt();
        b=in.nextInt();
        c=in.nextInt();
        System.out.println("before swapping a="+a+", b="+b+", c="+c);

        a=a+b+c;
        b=a-(b+c);
        c=a-(b+c);
        a=a-(b+c);
        System.out.print("After swapping a="+a+", b="+b+", c="+c);
        System.out.println( );
    }
}
