package polymorphism;
public class test2 {
    public static void main(String[] args) {
        child c = new child();
        System.out.println(c.a);
        parent p = new parent();
        System.out.println(p.a);
    }
}
