package prepare_1;

public class para_method3 {
    public static void main(String[] args) {
        repeat("tom & jerry",8);
    }
    public static void repeat(String s,int a)
    {
        for (int i =1;i<=a;i++)
        {
            System.out.println(s);
        }
    }
}
