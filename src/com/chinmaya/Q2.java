package com.chinmaya;
import java.util.*;
public class Q2 {
        public static void main(String args[])
        {
            int arr[]=new int[2];
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter 2 number::");
            for(int i=0;i<2;i++)
                arr[i]=sc.nextInt();
            System.out.println("Before Swapping values are::"+arr[0]+" "+arr[1]);
            parsVal(arr[0],arr[1]);
            System.out.println("Before Swapping by call by values are::"+arr[0]+" "+arr[1]);
            parsRef(arr);
            System.out.println("Before Swapping by call by reference are::"+arr[0]+" "+arr[1]);
        }
        public static void parsVal(int a, int b)
        {
            int flag;
            flag=a;
            a=b;
            b=flag;
        }
        public static void parsRef(int arr[])
        {
            int flag;
            flag=arr[0];
            arr[0]=arr[1];
            arr[1]=flag;
        }
    }


