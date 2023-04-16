//Q2.WAP to read student’s name, rollno and marks of n subjects. Print the Mark Sheet of the student.

package com.chinmaya;
import java.util.*;
public class lab_4_Q1 {
    public static void main(String args[])
    {
        String name;
        int roll,m=0,mark1,mark2,mark3,n=0,total,i,average=0,sum=0;
        Scanner in=new Scanner(System.in);

        System.out.print("Enter Name: ");
        name=in.nextLine();
        System.out.print("Enter Roll Number: ");
        roll=in.nextInt();
        System.out.println("No of subjects: ");
        n=in.nextInt();
        for (i=0;i<n;i++)
        {
            System.out.println("Enter mark." + (i + 1) + " : ");
            m = in.nextInt();
            sum += m;
            average = sum/n;
            System.out.println("Mark"+(i+1)+":"+m+ "\n");
            if(m>=80)
            {
                System.out.print("Grade" + "E");
            }
            else if(m>=60 && m<80) {
                System.out.print("Grade" + "A");
            }
            else if(m>=40 && m<60)
            {
                System.out.print("Grade" + "B");
            }
            else
            {
                System.out.print("Grade" + "C");
            }
            System.out.println("\n");
        }
        System.out.println("Name: "+name+ "\nRoll Number:" + roll);
        System.out.println("No of subjects: "+ n);
        System.out.println("Total: "+sum);
        System.out.println("Total marks: "+(100*n)+"\n");
        System.out.println("The average is " + average);
        }

}

