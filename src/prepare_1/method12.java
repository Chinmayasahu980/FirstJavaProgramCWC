//Write a Java method to compute the average of three numbers.
package prepare_1;
import java.util.Scanner;
public class method12 {
    public static void main(String[] args) {
        int res=avg();
        System.out.println(res);
    }
    public static int avg(){
        Scanner s = new Scanner(System.in);
        System.out.println("enter no1");
        int a = s.nextInt();
        System.out.println("enter no2");
        int b = s.nextInt();
        System.out.println("enter no3");
        int c = s.nextInt();
        int avarage =(a+b+c)/3;
        return avarage;
    }
}
