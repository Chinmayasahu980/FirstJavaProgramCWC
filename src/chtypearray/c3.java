package chtypearray;

public class c3 {
    public static void main(String[]args){
        String s1 = "hii";
        String s2 = new String ("hi");
        String s3 = new String ("hi");
        String s4 = new String ("hi");
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s2==s3);
        System.out.println(s1==s4);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s2.equals(s3));
        System.out.println(s3.equals(s4));
        System.out.println(s1.equals(s4));
    }
}
