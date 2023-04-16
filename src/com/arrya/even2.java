package com.arrya;

public class even2 {
    public static void main(String[] args) {
        int a[] = {45, 8, 6, 95, 11, 52, 45};
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                System.out.println(a[i]);
            }
        }
        for (int i = 0;i<a.length;i++)
        {
            if (a[i] % 2 != 0)
            {
                System.out.println(a[i]);
            }
        }

    }
}
