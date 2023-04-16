//Write a Java program to find the number of days in a month.
package programiz;

import java.util.Scanner;
public class month_day {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter a year");
        int year = s.nextInt();
        System.out.println("enter number of month");
        int a = s.nextInt();
        if (a==1) {
            System.out.println("31");
        }
        if (a==2){
            if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
                System.out.println("29");
            else
                System.out.println("28");
        }
        else if (a==3){
            System.out.println("31");
        }
        else if (a==4){
            System.out.println("30");
        }
        else if (a==5){
            System.out.println("31");
        }
        else if (a==6){
            System.out.println("30");
        }
        else if (a==7){
            System.out.println("31");
        }
        else if (a==8){
            System.out.println("31");
        }
        else if (a==9){
            System.out.println("30");
        }
        else if (a==10){
            System.out.println("31");
        }
        else if (a==11){
            System.out.println("30");
        }
        else if (a==12){
            System.out.println("31");
        }
        else{
            System.out.println("enter valid number");
        }
    }

}
