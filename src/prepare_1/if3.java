/*A shop will give discount of 10% if the cost of purchased quantity is more than 1000.
        Ask user for quantity
        Suppose, one unit will cost 100.
        Judge and print total cost for user.*/

package prepare_1;
import java.util.Objects;
import java.util.Scanner;
public class if3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter quantity");
        int a = s.nextInt();
        System.out.println("price of one pic");
        int b = s.nextInt();
        if ((a * b) > 1000) {
            System.out.println("your discount is " + ((a * b) * (0.1) + " total amount to paid " + ((a * b) - ((a * b) * (0.1)))));
        }
    }

}