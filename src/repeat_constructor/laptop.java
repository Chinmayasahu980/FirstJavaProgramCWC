package repeat_constructor;
import java.util.Scanner;
public class laptop {
    String brand;
    int ram;
    int price;
    public void file()
    {
        System.out.println(brand);
        System.out.println(ram);
        System.out.println(price);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        laptop l1 = new laptop();
        l1.brand = "hp";
        l1.ram = 8;
        l1.price = 50000;
        laptop l2 = new laptop ();
        l2.brand = "dell";
        l2.ram = 4;
        System.out.println("enter value for a");
        l2.price= s.nextInt();
        laptop l3 = new laptop ();
        l3.brand = "macbook";
        l3.ram = 16;
        l3.price = 150000;
        l1.file();
        l2.file();
        l3.file();
    }
}
