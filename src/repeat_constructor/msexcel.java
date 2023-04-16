package repeat_constructor;

public class msexcel {
    int row;
    int column;
    String fname;
    public  msexcel(int row,int column,String fname){
        this.row = row;
        this.column = column;
        this.fname = fname;
    }
    public void details()
    {
        System.out.println(row);
        System.out.println(column);
        System.out.println(fname);
    }

    public static void main(String[] args) {
        msexcel m1 = new msexcel(28,69,"xyz") ;
        m1.details();
        msexcel m2 = new msexcel(85,65,"abc");
        m2.details();
    }
}
