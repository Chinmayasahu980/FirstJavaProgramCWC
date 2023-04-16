package repeat_constructor;

public class file {
    String fname;
    String extention;
    int size;
    public file(String fname)
    {
        this.fname = fname;
    }
    public file(String fname,String extention)
    {
        this(fname);
        this.extention = extention;
    }
    public file(String fname,String extention,int size)
    {
        this(fname,extention);
        this.size = size;
    }
    public void details()
    {
        System.out.println(fname);
        System.out.println(extention);
        System.out.println(size);
    }
}
