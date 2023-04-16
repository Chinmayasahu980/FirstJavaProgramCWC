package repeat_constructor;

public class cab {
    String sp;
    String des;
    int price;
    public cab(String sp,String des,int price)
    {
        this.sp = sp;
        this.des = des;
        this.price = price;
    }
    public void details()
    {
        System.out.println(sp);
        System.out.println(des);
        System.out.println(price);
    }

}
