package com.chinmaya;
import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        n=sc.nextInt();
        if (n>0)
        {
            int[] array = new int[n];
            System.out.println("Enter the elements of the array: ");
            for(int i=0; i<n; i++) {
                array[i]=sc.nextInt();
            }
            System.out.println("Array elements are: ");
            for (int i=0; i<n; i++) {
                System.out.print(array[i]);
                if (i<n) {
                    System.out.print(", ");
                }
            }
            System.out.println();
            int max = array[0];
            int min = array[0];
            float mean = 0;
            for (int i=0; i<n; i++) {
                int tmp = array[i];
                if (tmp < min) {
                    min = tmp;
                }
                if (tmp > max) {
                    max = tmp;
                }
                mean+=tmp;
            }
            mean/=n;
            System.out.println("Maximum : " + max);
            System.out.println("Minimum : " + min);
            System.out.println("Mean : " + mean);
        } else {
            System.out.println("Array size can not be zero!!");
        }
    }
}
