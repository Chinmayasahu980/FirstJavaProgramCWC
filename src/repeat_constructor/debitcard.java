package repeat_constructor;

public class debitcard {
    private int cardno;
    private String name;
    private int date;
    private int cvv;
    public debitcard(int cardno)
    {
        this.cardno = cardno;
    }
    public debitcard(int cardno,String name)
    {
        this(cardno);
        this.name = name;
    }
    public debitcard(int cardno,String name,int date)
    {
        this(cardno,name);
        this.date = date;
    }
    public debitcard(int cardno,String name,int date,int cvv)
    {
        this(cardno,name,date);
        this.cvv = cvv;
    }
    public int getcardno()
    {
        return cardno;
    }
    public String getpwd()
    {
        return name;
    }
    public void setup()
    {
        this.date = date;
    }
    public void details()
    {
        System.out.println(cardno);
        System.out.println(name);
        System.out.println(date);
        System.out.println(cvv);
    }

    public static void main(String[] args) {
        debitcard d1 = new debitcard(43,"jshdh",11,856);
        d1.details();
    }
}
