package com.arrya;

public class t2 {
    public static void main(String[] args) {
        app[] a = new app[5];
        a[0] = new app("whatsapp",67.6d);
        a[1] = new app("instagram",97.1d);
        a[2] = new app("phonepe",17.9d);
        a[3] = new app("gpay",18.3d);
        a[4] = new app("youtube",68.4d);
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
        System.out.println(a[3]);
        System.out.println(a[4]);
        System.out.println(a[2].size);
        System.out.println(a[1].name);
    }
}
