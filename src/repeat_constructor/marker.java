package repeat_constructor;

public class marker {
    String name;
    String brand;
    String colour;
    int price;

    public static void main(String[] args) {
        marker m1 = new marker();
        m1.name = "permanent marker";
        m1.brand = "camlin";
        m1.colour = "blue";
        m1.price = 25;

        marker m2 = new marker();
        m2.name = "permanent marker";
        m2.brand = "link";
        m2.colour = "red";
        m2.price = 30;

        marker m3 = new marker();
        m3.name = "fountain marker";
        m3.brand = "elkos";
        m3.colour = "pink";
        m3.price = 25;

        System.out.println(m3.price);
        System.out.println(m3.name);
        System.out.println(m2.colour);
        System.out.println(m1.price);
        System.out.println(m2.name);

    }
}
