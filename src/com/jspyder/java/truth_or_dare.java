package com.jspyder.java;
import java.util.Scanner;
public class truth_or_dare {
    public static void main(String[] args) {
        System.out.println("take your dice");
        Scanner sc = new Scanner(System.in);
        int dice = sc.nextInt();
        switch (dice) {
            case 1: {
                System.out.println("sing");
            }
            break;
            case 2: {
                System.out.println("stand up");
            }
            break;
            case 3: {
                System.out.println("truth");
            }
            break;
            case 4: {
                System.out.println("sing");
            }
            break;
            case 5: {
                System.out.println("play");
            }
            case 6: {
                System.out.println("truth");
            }
            default: {
                System.out.println("repate case 1");
            }
            break;

        }

    }
}
