package chtypearray.String1;

public class c4 {
    public static void main(String[] args) {
        StringBuffer name1 = new StringBuffer("amla");
        System.out.println(name1.length());
        System.out.println(name1.capacity());
        name1.trimToSize();
        System.out.println(name1.length());
    }
}
