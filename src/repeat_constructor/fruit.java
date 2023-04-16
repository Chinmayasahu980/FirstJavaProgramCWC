package repeat_constructor;

public class fruit {
    String name;
    String colour;
    int price;
    public static void main(String[] args) {
        fruit f1 = new fruit();
        f1.name = "apple";
        f1.colour = "red";
        f1.price = 100;

        fruit f2 = new fruit();
        f2.name = "orange";
        f2.colour = "orange";
        f2.price = 90;

        System.out.println(f1.name);
        System.out.println(f2.price);
        System.out.println(f1.colour);
        System.out.println(f2.name);
}
}
