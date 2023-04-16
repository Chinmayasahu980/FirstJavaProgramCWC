package com.jspyder.java;

public class prime_num {
    public static void main(String[]args)
    {
        int num = 29;
        int count = 0;
        for (int i=1;i<=num;i++){
            if (num%i==0) {
                count++;
            }
            }
            if (count == 2)
            {
                System.out.println("prime num");
            }
            else
            {
                System.out.println("not a prime num");
            }

    }
}

