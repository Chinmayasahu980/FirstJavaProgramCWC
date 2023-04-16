//Write a program in Java to display the multiplication table of a given integer.
package programiz;

import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter a number");
        int n = s.nextInt();
        int i;
        for (i = 1; i <= 10; i++) {
            System.out.println(n+" * " + i+ " = "+ (n*i));
        }

    }
}
