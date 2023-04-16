package prepare_1;

public class t2 {
    public static void main(String[] args) {
        contact c1 = new contact("sheela",845852963);
        contact c2 = new contact("lela",852369741);
        contact c3 = new contact("lela",852369741);
        System.out.println(c1 == c2);
        System.out.println(c1.equals(c2));
        System.out.println(c2.equals(c3));
        System.out.println(c2 == c3);
        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c3.hashCode());
    }
}
