package com.chinmaya;
import java.util.Scanner;
    public class cgpa
    {
        public static void main(String[]args)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter physics mark");
            int num1 = sc.nextInt();
            System.out.println("enter chemistry mark");
            int num2 = sc.nextInt();
            System.out.println("enter math");
            int num3 = sc.nextInt();
            float sum = (num1+num2+num3)/3.0f;
            System.out.println(sum);
            if(sum>=40 || num1>=33 && num2>=33 && num3>=33)
            {
                System.out.println("you are passed");
            }
            else{
                System.out.println("you are failed");
            }
    }

}
