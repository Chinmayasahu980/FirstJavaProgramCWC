package repeat_constructor;

public class camera {
    String name;
    int pixel;
    public camera(String name,int pixel)
    {
        this.name = name;
        this.pixel = pixel;
    }
    public camera(String name)
    {
        this.name = name;
    }
    public void details()
    {
        System.out.println(name);
        System.out.println(pixel);
    }

}
