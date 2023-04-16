package com.opps_constructor.java;

public class msexcel {
    int row;
    int column;
    String Fname;

    public msexcel(int row,int column,String Fname)
    {
        this.row = row;
        this.column = column;
        this.Fname = Fname;
    }

    public void details()
    {
        System.out.println(row);
        System.out.println(column);
        System.out.println(Fname);
    }
    public static void main(String[]args)
    {
        msexcel m1=new msexcel(19,15,"vipin");
        m1.details();
        msexcel m2 = new msexcel(12,58,"rahul");
        m2.details();
    }
}
