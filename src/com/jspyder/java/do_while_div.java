package com.jspyder.java;

public class do_while_div {
    public static void main(String[]args){
        int i = 1;
        do
        {
            if (i%3==0 && i%5==0)
            {
                System.out.println(i);
            }
            i++;
        }
        while(i<=50);


    }
}
