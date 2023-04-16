package repeat_constructor;

public class singer {
    String name;
    String singer;
    String directer;

    public singer(String name)
    {
        this.name = name;
    }
    public singer(String name,String singer)
    {
        this(name);
        this.singer = singer;
    }
    public singer(String name,String singer,String directer)
    {
        this(name,singer);
        this.directer = directer;
    }
    public void details()
    {
        System.out.println(name);
        System.out.println(singer);
        System.out.println(directer);
    }
}
