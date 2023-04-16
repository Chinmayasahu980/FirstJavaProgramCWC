//1. Write a Java method to find the smallest number among three numbers.
package programiz;

import java.util.Scanner;

public class method11 {
    public static void main(String[] args) {
        int res= big();
        System.out.println( "tha biggest number is "+res);
    }
    public static int big()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("enter no1");
        int a = s.nextInt();
        System.out.println("enter no2");
        int b = s.nextInt();
        System.out.println("enter no3");
        int c = s.nextInt();
        if(a>b && a>c)
        {
            return a;
        }
        else if(b>a && b>c)
        {
            return b;
        }
        else
        {
            return c;
        }
    }
}
