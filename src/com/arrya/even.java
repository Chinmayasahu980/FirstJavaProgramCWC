package com.arrya;

public class even {
    public static void main(String[]args)
    {
        int a[] = {25,36,16,45,75,87};
        System.out.println("even number");
        for(int i=0;i<a.length;i++){
            if(a[i]%2 == 0)
            {
                System.out.println(a[i]);
            }
        }
    }
}
