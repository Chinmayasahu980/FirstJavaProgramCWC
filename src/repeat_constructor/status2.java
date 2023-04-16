package repeat_constructor;

public class status2 {
    String name;
    int cno;
    float time;
    public status2(String name,int cno,float time)
    {
        this.name = name;
        this.cno = cno;
        this.time = time;
    }
    public status2(String name)
    {
        this.name = name;
    }
    public status2(String name,int cno)
    {
        this.name = name;
        this.cno = cno;
    }

    public void details()
    {
        System.out.println(name);
        System.out.println(cno);
        System.out.println(time);
    }
    public static void main(String[] args) {
        status2 s1 = new status2("ysadg0",456,852);
        s1.details();
        status2 s2 = new status2("asghd",45852,95123);
        s2.details();
        System.out.println( );
    }


}
