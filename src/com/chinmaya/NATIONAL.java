/*5) Desing the follwoing PATTERN for given Input String
        Input: NATIONAL
        Output: N
        NA
        NAT
        NATI
        NATIO
        NATION
        NATIONA
        NATIONAL
 */
        package com.chinmaya;
import java.util.Scanner;
public class NATIONAL {
    public static void main(String[] args) {
        String st;
        int len;
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter any string");
        st= sc.nextLine();
        len=st.length();
        for(int i = 0; i < len; i++)
        {
            for(int j =0; j<=i; j++)
            {
                System.out.print(st.charAt(j));
            }
            System.out.println();
        }
    }
}
