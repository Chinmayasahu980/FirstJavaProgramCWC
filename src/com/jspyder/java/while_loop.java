package com.jspyder.java;

import java.util.Scanner;

public class while_loop {
    public static void main(String[]args){
        int i = 1;
        while (i<=20)
        {
            System.out.println(i);
            i++;
        }
    }

    public static class main {
        public static void main(String args[]) {
            int result, temp, R = 0, t;
            Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();
            System.out.println("Entered no. is  " + N);
            result = N * N;
            while (result > 0) {
                temp = result;
                t = temp % 10;
                R += t;
                temp /= 10;
            }
            if (R == N) {
                System.out.println("Entered no. is NEON no.");
            } else {
                System.out.println("Entered no. is not a NEON no. ");
            }
        }
    }
}
