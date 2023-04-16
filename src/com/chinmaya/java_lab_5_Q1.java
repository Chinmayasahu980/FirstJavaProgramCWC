package com.chinmaya;
import java.util.Scanner;
public class java_lab_5_Q1 {
        public static void main(String args[])
        {
            String str;
            Scanner in = new Scanner(System.in);
            System.out.println("enter a string");
            str=in.nextLine();
            int upper = 0, lower = 0, dig = 0,s = 0,space =0,i,w=0;

            for( i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (ch >= 'A' && ch <= 'Z')
                    upper++;
                else if (ch >= 'a' && ch <= 'z')
                    lower++;
                else if (ch >= '0' && ch <= '9')
                    dig++;
                else if (ch== ' ')
                    s++;
                else
                    space++;
            }

            char ch[]=new char[str.length()];
            for(i = 0; i < str.length(); i++)
            {
                ch[i]=str.charAt(i);
                if (( (i>0) && (ch[i]!=' ') && (ch[i-1]==' ') ) || ( (ch[0]!=' ') && (i==0) ))
                    w++;
            }

            System.out.println("Lower case letters : " + lower);
            System.out.println("Upper case letters : " + upper);
            System.out.println("Digit : " + dig);
            System.out.println("Words = " + w);
            System.out.println("Spaces = " + space);

        }
    }

