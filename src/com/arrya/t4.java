package com.arrya;

public class t4 {
    public static void main(String[] args) {
        product[] a =new product[4];
        a[0] = new product("keyboard",220,1550);
        a[1] = new product("mouse",2201,650);
        a[2] = new product("laptop",2002,78955);
        a[3] = new product("monitor",456,8529);
        for(int i = 0;i<a.length;i++)
        {
            System.out.println(a[i].name);
            System.out.println(a[i].price);
            System.out.println(a[i].id);
        }
    }
}
