package repeat_constructor;

public class ticket {
    long tno;
    int count;
    long price;
    public ticket(long tno)
    {
        this.tno = tno;
    }
    public ticket(long tno,int count,long price)
    {
        this(tno);
        this.count = count;
        this.price = price;
    }
    public void details()
    {
        System.out.println(tno);
        System.out.println(count);
        System.out.println(price);
    }
}
