package com.chinmaya;
import java.util.Scanner;
public class ifelse{
public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("what is your age");
    int age =sc.nextInt();
    boolean bayasa = (age == 18);
        if(bayasa){
            System.out.println("you can drive");
        }
        else{
            System.out.println("sorry you can't drive");
        }



    }
}
