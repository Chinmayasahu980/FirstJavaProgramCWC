package com.chinmaya;

import java.util.Scanner;

public class rectangle
{ public static void main (String[] args)
{
    double area,length,width;
    Scanner scanner = new Scanner(System.in);
    System.out.println("length of Rectangle:");
    length = scanner.nextDouble();
    System.out.println("width of Rectangle:");
    width = scanner.nextDouble();
    area = length*width;
    System.out.println("Area of Rectangle is:");
    System.out.print(area);

}
}
