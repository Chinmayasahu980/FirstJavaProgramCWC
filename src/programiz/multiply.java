//Java Program to Multiply two Floating Point Numbers
package programiz;
import java.util.Scanner;
public class multiply {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter first integer");
        int a =s.nextInt();
        System.out.println("enter second integer");
        int b = s.nextInt();
        int c = a*b;
        System.out.println(c);
    }
}
