package repeat_constructor;

public class cake {
    String name;
    String flavore;
    int price;
    public void initialize(String name,String flavore,int price){
        this.name = name;
        this.flavore = flavore;
        this.price = price;
    }
    public void cakedetails()
    {
        System.out.println(name);
        System.out.println(flavore);
        System.out.println(price);
    }

    public static void main(String[] args) {
        cake c1 = new cake();
        c1.initialize("red","strawbery",650);
        c1.cakedetails();
    }
}

