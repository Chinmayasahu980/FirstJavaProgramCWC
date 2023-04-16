package repeat_constructor;

public class msexcel1 {
    int row;
    int column;
    String fname;
    public msexcel1(int row,int column,String fname)
    {
        this.row = row;
        this.column  = column;
        this.fname = fname;
    }
    public void details()
    {
        System.out.println(row);
        System.out.println(column);
        System.out.println(fname);
    }

    public static void main(String[] args) {
        msexcel1 m1 = new msexcel1(45,25,"sgd");
        m1.details();
        msexcel1 m2 = new msexcel1(45,8,"ags");
        m2.details();
    }
}
