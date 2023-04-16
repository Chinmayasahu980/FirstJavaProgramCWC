package repeat_constructor;

public class whatsapp2 {
    String name ;
    int cno;
    int alcno;
    public whatsapp2(String name,int cno,int alcno)
    {
        this.name = name;
        this.cno = cno;
        this.alcno = alcno;
    }
    public void details()
    {
        System.out.println(name);
        System.out.println(cno);
        System.out.println(alcno);
    }

    public static void main(String[] args) {
        whatsapp2 w1 = new whatsapp2("apple",54,9);
        w1.details();
        whatsapp2 w2 = new whatsapp2("banana",58,45);
        w2.details();
    }

}
