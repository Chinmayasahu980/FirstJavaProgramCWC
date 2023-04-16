package polymorphism;

public class test7 {
    public static void main(String[] args) {
        bank b = new b1();
        b.deposite();
        b.withdraw();
        b1 b2 = new b1();
        b.withdraw();
        b.deposite();
    }
}
