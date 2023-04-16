package repeat_constructor;

public class whatsapp {
    String name;
    long cno ;
    public whatsapp(String name,long cno)
    {
        this.name = name;
        this.cno = cno;
    }
    public void details()
    {
        System.out.println(name);
        System.out.println(cno);
    }

    public static void main(String[] args) {
        whatsapp w1 = new whatsapp("chinmaya",8847871971l);
        w1.details();
        whatsapp w2 = new whatsapp("rahul",9438399589l);
        w2.details();
        whatsapp w3 = new whatsapp("asjd",8985354663l);
        w3.details();
    }
}
