//Write a Java program that keeps a number from the user and generates an integer between 1 and 7 and displays the name of the weekday.
package programiz;
import java.util.Scanner;
public class weekend {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter a day number");
        int a = s.nextInt();
        if(a>=1 && a<=7) {
            if (a == 1) {
                System.out.println("monday");
            } else if (a == 2) {
                System.out.println("teausday");
            } else if (a == 3) {
                System.out.println("wednesday");
            } else if (a == 4) {
                System.out.println("thrusday");
            } else if (a == 5) {
                System.out.println("friday");
            } else if (a == 6) {
                System.out.println("weekend");
            } else {
                System.out.println("weekend");
            }
        }
        else{
            System.out.println("reenter number between 1-7");
        }
    }
}
