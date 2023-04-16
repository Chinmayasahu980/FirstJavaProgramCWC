package com.chinmaya;
import java.util.Scanner;
class Complex
{
    double real, img;
    public Complex(double r, double i)
    {
        real = r; img= i;
    }
    public void mul(Complex c1, Complex c2)
    {
        real=(c1.real * c2.real)-(c1.img * c2.img);
        img=(c1.real*c2.img)+(c1.img*c2.real);
    }
    void display( )
    {
        System.out.print(real);
        System.out.printf("%+.2gi\n", img);
    }
}
public class lab_4_Q4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double r1, i1, r2, i2;
        System.out.println("enter the complex number of c1::");
        r1 = sc.nextDouble();
        i1 = sc.nextDouble();
        System.out.println("enter the complex number of c2::");
        r2 = sc.nextDouble();
        i2 = sc.nextDouble();
        Complex c1 = new Complex(r1, i1);
        Complex c2 = new Complex(r2, i2);
        Complex c3 = new Complex(0, 0);
        c3.mul(c1, c2);
        System.out.print("multiplication of Two Complex Numbers = ");
        c3.display();
    }
}