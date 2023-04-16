//Write a program in Java to display the cube of the number upto given an integer.
package programiz;
import java.util.Scanner;
public class Q13 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter a number");
        int n = s.nextInt();
        int i;
        for(i=1;i<=n;i++)
        {
            System.out.println("Number is : "+i+ " and cube of " +i+ " is : "+(i*i*i));
        }
    }
}
