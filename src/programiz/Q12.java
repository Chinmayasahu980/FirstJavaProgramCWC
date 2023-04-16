//Write a program in Java to input 5 numbers from keyboard and find their sum and average.
package programiz;
import java.util.Scanner;
public class Q12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter a");
        int a = s.nextInt();
        System.out.println("enter b");
        int b = s.nextInt();
        System.out.println("enter c");
        int c = s.nextInt();
        System.out.println("enter d");
        int d = s.nextInt();
        System.out.println("enter e");
        int e = s.nextInt();
        int sum = a+b+c+d+e ;
        float avg = sum/5f;
        System.out.println(sum);
        System.out.println(avg);
    }
    }

