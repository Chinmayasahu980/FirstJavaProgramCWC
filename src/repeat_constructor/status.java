package repeat_constructor;

public class status {
    String name;
    double time;
    public status(String name,double time)
    {
        this.name = name;
        this.time = time;
    }
    public void details()
    {
        System.out.println(name);
        System.out.println(time);
    }

    public static void main(String[] args) {
        status s1 = new status("chinmaya",8.30);
        s1.details();
        status s2 = new status("rahul",8.50);
        s2.details();
    }
}
