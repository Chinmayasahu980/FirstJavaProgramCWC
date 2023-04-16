package com.chinmaya;
import java.util.Scanner;
public class l5Q4 {
    public static void printInitials(String str)
{
    int len = str.length();
    str = str.trim();
    String t = "";
    for (int i = 0; i < len; i++) {
        char ch = str.charAt(i);
        if (ch != ' ') {
            t = t + ch;
        }
        else {
            System.out.print(Character.toUpperCase(t.charAt(0))
                    + ". ");
            t = "";
        }
    }
    String temp = "";
    for (int j = 0; j < t.length(); j++) {
        if (j == 0)
            temp = temp + Character.toUpperCase(t.charAt(0));
        else
            temp = temp + Character.toLowerCase(t.charAt(j));
    }
    System.out.println(temp);
}
    public static void main(String[] args)
    {
        System.out.println("Chinmaya sahu,202060012");
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name:");
        str = sc.nextLine();
        int length = str.length();
        printInitials(str);
    }
}
