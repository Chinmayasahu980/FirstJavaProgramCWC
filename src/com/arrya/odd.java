package com.arrya;

public class odd {
    public static void main(String[]args){
        int a[] = {15,25,42,62,36,81,49,76};
        System.out.println("odd number");
        for(int i=0;i<a.length;i++){
            if(a[i]%2 != 0){
                System.out.println(a[i]);
            }

        }
    }
}
