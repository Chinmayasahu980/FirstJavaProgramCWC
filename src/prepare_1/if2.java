//Take two int values from user and print greatest among them.
package prepare_1;
import java.util.Scanner;
public class if2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter value for a");
        int a = s.nextInt();
        System.out.println("enter value for b");
        int b = s.nextInt();
        if(a<b)
        {
            System.out.println("b is bigger then a");
        }
        else
        {
            System.out.println("a is bigger then b");
        }

    }
}
