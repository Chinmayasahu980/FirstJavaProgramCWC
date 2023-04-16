package com.chinmaya;

public class sum_even_number {
    public static void main(String[] args) {
        int sum = 0;
        int n=3 ;
        int i= 0;
        while(i<n){
            i++;

            sum=sum+(2*i);
        }
        System.out.println("sum of enen number is:");
        System.out.println(sum);
    }
}
