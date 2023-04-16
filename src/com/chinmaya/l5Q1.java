package com.chinmaya;

import java.util.Scanner;
public class l5Q1 {
    public static void main(String []args) {
        System.out.println("Chinmaya sahu,202060012");
        String str, rev = "";
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter one string:");
        str = sc.nextLine();
        int length = str.length();
        for ( int i = length - 1; i >= 0; i-- )
            rev = rev + str.charAt(i);
        if (str.equals(rev))
            System.out.println(str+" palindrome");
        else
            System.out.println(str+" not palindrome");
    }
}
