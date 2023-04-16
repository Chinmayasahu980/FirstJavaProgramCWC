package prepare_1;

public class student {
    String name;
    int id;
    public student (String name,int id)
    {
        this.name = name;
        this.id = id;
    }
    @Override
    public String toString()
    {
        return name +" "+ id;
    }

}
