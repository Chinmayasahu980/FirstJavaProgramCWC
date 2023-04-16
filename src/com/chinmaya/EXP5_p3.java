package com.chinmaya;
import java.util.*;
class Overload
{
    double pi=Math.PI;
    void volume(float r)
    {
        double vol=(4.0/3.0);
        double pi=(r*r*r);
        System.out.printf("Volume of the sphere= %.2f",vol);
    }
    void volume(float h, float r)
    {
        double vol=pi*(r*r)*h;
        System.out.printf("Volume of the cylinder= %.2f",vol);
    }
    void volume(double h, double r)
    {
        double vol=pi*(r*r)*h/3;
        System.out.printf("Volume of the cone= %.2f",vol);
    }
}
public class EXP5_p3
{
    public static void main(String args[])
    {
        float r,h;
        double red,hei;
        Overload obj = new Overload();
        Scanner sc=new Scanner(System.in);
        System.out.println("MENU:");
        System.out.println("1 -> Sphere");
        System.out.println("2 -> Cylinder");
        System.out.println("3 -> Cone ");
        int no = sc.nextInt();
        switch(no)
        {
            case 1:
                System.out.println("Enter radius of the Sphere:");
                r=sc.nextFloat();
                obj.volume(r);
                break;
            case 2:
                System.out.println("Enter radius of the Cylinder:");
                r=sc.nextFloat();
                System.out.println("Enter height of the Cylinder:");
                h=sc.nextFloat();
                obj.volume(h,r);
                break;
            case 3:
                System.out.println("Enter radius of the Sphere:");
                red=sc.nextDouble();
                System.out.println("Enter height and base:");
                hei=sc.nextDouble();
                obj.volume(hei,red);
                break;
            default:
                System.out.println("Wrong choice");
        }
    }
}
