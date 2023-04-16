package repeat_constructor;

public class vedio {
    String name;
    float size;
    String data;
    public vedio(String name,float size,String data)
    {
        this.name = name;
        this.size = size;
        this.data = data;
    }
    public vedio(String name,float size)
    {
        this. name = name;
        this. size = size;
    }
    public vedio(String name)
    {
        this.name = name;
    }
    public void details()
    {
        System.out.println(name);
        System.out.println(size);
        System.out.println(data);
    }
}
