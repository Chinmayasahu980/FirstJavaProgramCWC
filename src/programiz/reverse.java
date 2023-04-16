package programiz;

public class reverse {
    public static void main(String[] args) {
        int res= reverse(5689);
        System.out.println(res);
    }
    public static int reverse(int num)
    {
        int reverse = 0;
        while(num !=0)
        {
            int last  = num%10;
            reverse = reverse*10+last;
            num /=10;
        }
        return reverse;
    }
}
