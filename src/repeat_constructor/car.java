package repeat_constructor;

public class car {
    String name;
    String brand;
    String colour;
    int price;

    public static void main(String[] args) {
        car c1 = new car();
        c1.name = "jaaz";
        c1.brand = "Honda";
        c1.colour = "white";
        c1.price = 1000000;

        car c2 = new car();
        c2.name = "maruti";
        c2.brand = "suzuki";
        c2.colour = "grew";
        c2.price = 700000;

        car c3 = new car();
        c3.name = "A3";
        c3.brand = "audi";
        c3.colour = "black";
        c3.price = 10009999;

        System.out.println(c1.name);
        System.out.println(c3.price);
        System.out.println(c2.colour);
        System.out.println(c2.price);
        System.out.println(c1.brand);
    }
}
