package com.jspyder.java;

public class vowel_para_method {
    public static void main(String[]args)
    {
        vowel('a');
        vowel('e');
    }
    public static void vowel(char ch){

        if (ch=='a'|| ch=='A'|| ch=='e'|| ch=='E'|| ch=='i'|| ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U')
        {
            System.out.println("letter is a vowel");
        }
     else {
            System.out.println("letter is a not vowel");
        }
    }
}
