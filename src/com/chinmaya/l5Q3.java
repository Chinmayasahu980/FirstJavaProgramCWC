package com.chinmaya;
import java.util.Scanner;
public class l5Q3 {
    public static void main(String args[])
{
    System.out.println("Chinmaya sahu,202060012");
    String temp;
    Scanner SC = new Scanner(System.in);
    System.out.print("Enter number of friends: ");
    int N= SC.nextInt();
    SC.nextLine();
    String names[] = new String[N];

    System.out.println("Enter all friends names: ");
    for(int i=0; i<N; i++)
    {
        System.out.print("Enter friend name [ " + (i+1) +" ]: ");
        names[i] = SC.nextLine();
    }
    for(int i=0; i<5; i++)
    {
        for(int j=1; j<5; j++)
        {
            if(names[j-1].compareTo(names[j])>0)
            {
                temp=names[j-1];
                names[j-1]=names[j];
                names[j]=temp;
            }
        }
    }
    System.out.println("\n names are in shorted Ascending Order: ");
    for(int i=0;i<N;i++)
    {
        System.out.println(names[i]);
    }
}
}
