/*Write a Java program that reads a floating-point number and prints "zero" if the number is zero. Otherwise, print
"positive" or "negative". Add "small" if the absolute value of the number is less than 1, or"large" if it exceeds 1,000,000.*/
package programiz;
import java.util.Scanner;
public class posi_or_neg {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter a integer");
        int a = s.nextInt();
        if(a<0) {
            System.out.println("number is negative");
        }
        else if (a==0)
        {
            System.out.println("number os zero");
        }
        else if(a>0 ) {
            if (a > 1000000) {
                System.out.println("larger");
            } else {
                System.out.println("number is positive");
            }
        }
        else
        {
            System.out.println("enter a valid integer");
        }

    }
}
