//1.Take values of length and breadth of a rectangle from user and check if it is square or not.
package prepare_1;
import java.util.Scanner;
public class if1 {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
        System.out.println("enter length");
        int x = s.nextInt();
        System.out.println("enter breadth");
        int y = s.nextInt();
        if (x==y) {
            System.out.println("this is a square");
        }
        else
        {
            System.out.println("this not a square");
        }
    }
}
