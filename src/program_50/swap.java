package program_50;

public class swap {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        System.out.println("a = "+a+" and b = "+b);
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("After swapping, a is "+a+" and b is"+b);
    }
}
