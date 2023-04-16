//Write a Java program that takes a year from user and print whether that year is a leap year or not.
package programiz;
import java.util.Scanner;
public class Q9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter a year");
        int year = s.nextInt();

            if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
                System.out.println("leap year");
            else
                System.out.println("not a leap year");
    }
}
