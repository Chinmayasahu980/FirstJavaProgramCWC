package repeat_constructor;
public class application {
    String name ;
    long cno;
    long alcno;
    public application(String name,long cno)
    {
        this.name = name;
        this.cno = cno;
    }
    public application(String name,long cno,long alcno)
    {
        this.name = name;
        this.cno = cno;
        this.alcno = alcno;
    }
    public application(String name)
    {
        this.name = name;
    }
    public void details()
    {
        System.out.println(name);
        System.out.println(cno);
        System.out.println(alcno);
    }

    public static void main(String[] args) {
        application a1 = new application("chinmaya", 2548796525l);
        a1.details();
        application a2 = new application("chinmaya sahu",8847871971l,9438399589l);
        a2.details();
        application a3 = new application("rahul",7879502041l);
        a3.details();
    }
}
