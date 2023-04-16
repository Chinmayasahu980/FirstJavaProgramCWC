package repeat_constructor;

public class sim {
    private long sno;
    private String sp;
    private double balance;
    public sim(long sno)
    {
        this.sno = sno;
    }
    public sim(long sno,String sp)
    {
        this(sno);
        this.sp = sp;
    }
    public sim(long sno,String sp,double balance)
    {
        this(sno,sp);
        this.balance = balance;
    }
    public void details()
    {
        System.out.println(sno);
        System.out.println(sp);
        System.out.println(balance);
    }

    public static void main(String[] args) {
        sim s1 = new sim(1025,"jjhs",1001100l);
        s1.details();

    }
}
