package com.chinmaya;
public class l5qq2 {
    public static void main(String args[])
{
    System.out.println("Chinmaya sahu,202060012");
    String large=args[0];
    String small=args[0];
    for (int i =1; i <args.length; i++)
    {
        if(args[i].length()>large.length())
            large=args[i];
        if(args[i].length()<small.length())
            small=args[i];
    }
    System.out.println("The longet word of string is::"+large);
    System.out.println("The shortest word of string is::"+small);
}
}

