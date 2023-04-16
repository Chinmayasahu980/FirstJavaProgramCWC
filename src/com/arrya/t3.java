package com.arrya;

public class t3 {
    public static void main(String[] args) {
        product[] a =new product[4];
        a[0] = new product("keyboard",220,1550);
        a[1] = new product("mouse",2201,650);
        a[2] = new product("laptop",2002,78955);
        a[3] = new product("monitor",456,8529);
        System.out.println(a[0]);
        System.out.println(a[1].name);
        System.out.println(a[2].id);
        System.out.println(a[3].price);
    }
}
