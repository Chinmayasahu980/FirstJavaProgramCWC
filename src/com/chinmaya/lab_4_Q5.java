/* Q5.  Write a JAVA program to read the data of an employee and basic salary and
        compute his gross and netSalary. Print the Employee details with gross and
        netSalary.
        DA=52% of basic, TA=30% of basic, HRA=25% of basic
        grossSal=basicPay+DA+TA+HRA
        tax =20% of grossSal
        netSal= grossSal – tax
*/
package com.chinmaya;
import java.util.*;
    class employee {
    String name;
    int id,BS,HRA,DA,TA,GS=0,tax,NS=0;
    public void read()
    {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the employee id");
        id=in.nextInt();
        System.out.println("Enter the employee name");
        name=in.next();
        in.next();
        System.out.println("Enter the basic salary of an employee");
        BS=in.nextInt();
        calculate();
    }
    public void calculate()
    {
        HRA=BS*25/100;
        DA=BS*52/100;
        TA=BS*30/100; GS=BS+DA+HRA+TA;
        tax=GS*20/100;
        NS=GS-tax;
    }
    public void display()
    {
        System.out.println("Employeeid: "+id+"\n"+"Employename: "+name+"\n"+"Gross:   "+GS+"\n"+"netsalary: "+NS);
    }
}
    class lab_4_Q5
    {
        public static void main(String args[])
        {
            employee employeobj=new employee();
            employeobj.read();
            employeobj.display();
        }
    }


