package com.chinmaya;
import java.util.*;
class Employee
{
    private String name,department;
    private int id;
    private float sal;
    Employee()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name");
        name=sc.nextLine();
        System.out.println("Enter Department");
        department=sc.nextLine();
        System.out.println("Enter EMP_ID");
        id=sc.nextInt();
        System.out.println("Enter the Salary");
        sal=sc.nextFloat();
    }
    void showDetails()
    {
        System.out.println("Emplyee Details");
        System.out.println("name : "+name);
        System.out.println("Department : "+department);
        System.out.println("EMP_ID : "+id);
        System.out.println("Salary : "+sal);
    }
    float getSalary(){
        return sal;
    }
}
class Manager extends Employee
{
    private float bonous;
    Manager()
    {
        super();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Bonous");
        bonous=sc.nextFloat();
    }
    void showManagerDetails()
    {
        super.showDetails();
        System.out.println("BONOUS :"+bonous);
    }
    float getTotalSalary(){
        return super.getSalary()+bonous;
    }
    static Manager max(Manager arr[])
    {
        Manager max = arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if((arr[i].getTotalSalary()) > max.getTotalSalary())
                max=arr[i];
        }
        return max;
    }
}
class EXP5_202060012_p2
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Manager");
        int n = sc.nextInt();
        Manager obarr[] = new Manager[n];
        for(int i=0;i<obarr.length;i++)
            obarr[i]=new Manager();
        Manager max = Manager.max(obarr);
        System.out.println("Manager with max salary");
        max.showManagerDetails();
    }
}