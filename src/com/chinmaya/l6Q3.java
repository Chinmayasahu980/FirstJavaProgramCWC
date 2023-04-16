/*Create a two interfaces of Subsum, Muldiv. Subsum have method of sub() and sum().
Muldiv extends Subsum with having methods mul() and div(). Also create a class Arithmetic
implementing the Muldiv interfaces having its own method mod().*/

package com.chinmaya;
import java.util.*;
    interface Subsum
    {
        public void sub();
        public void sum();
    }
    interface Muldiv extends Subsum
    {
        public void mul();
        public void div();
    }
    class Arithmetic implements Muldiv
    {
        int a,b;
        Arithmetic(int a,int b){
            this.a = a;
            this.b = b;
        }
        public void sum(){
            System.out.println("Sum of the two no : "+(a+b));
        }
        public void sub(){
            System.out.println("Sub of the two no : "+(a-b));
        }
        public void mul(){
            System.out.println("Multiplication of the two no : "+(a*b));
        }
        public void div(){
            System.out.println("Division of the two no : "+(a/b));
        }
        public void mod()
        {
            System.out.println("Modulous of the two  no : "+(a%b));
        }
    }
    class l6Q3
    {
        public static void main(String args[])
        {
            int a,b;
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the first integer::");
            a = sc.nextInt();
            System.out.print("Enter the seocnd integer::");
            b= sc.nextInt();
            Arithmetic  a1= new Arithmetic(a,b);
            a1.sum();
            a1.sub();
            a1.mul();
            a1.div();
            a1.mod();
        }
    }

