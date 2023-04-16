package prepare_1;

public class t4 {
    public static void main(String[] args) {
        laptop l1 = new laptop("hp",8,30000);
        laptop l2 = new laptop("lenovo",4,25000);
        System.out.println(l1.equals(l2));
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l1.hashCode());
        System.out.println(l2.hashCode());
    }
}
