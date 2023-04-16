package programiz;

public class power1 {
    public static void main(String[] args) {
        power(5,10);
    }
    public static int power(int a,int b)
    {
        int res = 1;
        for(int i =1;i<=b;i++){
            res=a*res;
        }
        System.out.println(res);
        return res;
    }
}
