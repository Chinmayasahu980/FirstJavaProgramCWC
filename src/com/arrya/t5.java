package com.arrya;

public class t5 {
    public static void main(String[] args) {
        certificate [] c = new certificate[3];
        c[0] = new certificate("chinmaya",65,"mca");
        c[1] = new certificate("mantu",56.36,"mca");
        c[2] = new certificate("sahu",99,"b.sc");
        System.out.println(c[0]);
        System.out.println(c[1]);
        System.out.println(c[2]);
        System.out.println(c[2].percentage );
    }
}
