package prepare_1;

public class t3 {
    public static void main(String[] args) {
        facebook f1 = new facebook("8847871971","chinmaya@sahu");
        facebook f2 = new facebook("chinmayasahu980@gmail.com","chinmaya980");
        System.out.println(f1.username);
        System.out.println(f1.hashcode());
        System.out.println(f2.hashcode());
        System.out.println(f1.equals(f2));
        System.out.println(f1);
    }
}
