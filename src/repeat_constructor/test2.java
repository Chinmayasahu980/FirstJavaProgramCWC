package repeat_constructor;

public class test2 {
    public static void main(String[] args) {
        camera c1 = new camera("canon",84);
        c1.details();
        camera c2 = new camera("nikon");
        c2.details();
    }
}
