//Take three numbers from the user and print the greatest number.
package programiz;
import java.util.Scanner;
public class gretest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter first integer");
        int a =s.nextInt();
        System.out.println("enter second integer");
        int b =s.nextInt();
        System.out.println("enter third integer");
        int c =s.nextInt();
        if (a<b)
        {
            System.out.println(b+" is largest");
        }
        else if(a<c)
        {
            System.out.println(c+" is largest");
        }
        else
        {
            System.out.println(a+" is largest");
        }
    }
}
