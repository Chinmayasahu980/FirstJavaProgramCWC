/*
4) WAP to print the fibonacci series upto 20 terms.
*/

package com.chinmaya;
public class fibonacci_serie {
            public static void main(String[] args) {
                int n = 20, first  = 0, second = 1;
                System.out.println("Fibonacci Series");

                for (int i = 1; i <= n; ++i) {
                    System.out.print(first + ", ");

                    int next = first + second;
                    first = second;
                    second = next;
                }
            }
}


