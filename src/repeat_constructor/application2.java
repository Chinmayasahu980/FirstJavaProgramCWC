package repeat_constructor;

public class application2 {
    String name;
    int cno;
    int alcno;
    public application2(String name,int cno,int alcno)
    {
        this.name = name;
        this.cno = cno;
        this.alcno = alcno;
    }
    public application2(String name,int cno)
    {
        this.name = name;
        this.cno = cno;
    }
    public application2(String name)
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
        application a1 = new application("hagshjd", 8595, 7);
        a1.details();
        application a2 = new application("ahsg",755,185);
        a2.details();
    }
}
