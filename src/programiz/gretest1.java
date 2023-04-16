package programiz;

public class gretest1 {
    public static void main(String[] args) {
        int res = great(15,58,95);
        System.out.println("gretest is "+res);
    }
    public static int great(int a,int b,int c)
    {
        if(a>b && a>c)
        {
            return a;
        }
        else if (b>c)
        {
            return b;
        }
        else
        {
            return c;
        }
    }
}
