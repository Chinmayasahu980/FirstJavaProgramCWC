package repeat_constructor;

public class status1 {
    String name;
    long cno;
    float time;

    public status1(String name)
    {
        this.name = name;
    }
    public status1(String name,long cno)
    {
        this.name = name;
        this.cno = cno;
    }
    public status1(String name,long cno,float time)
    {
        this.name = name;
        this.cno = cno;
        this.time = time;
    }
    public void details()
    {
        System.out.println(name);
        System.out.println(cno);
        System.out.println(time);
    }

    }

