package programiz;

public class method5 {
    public static void main(String[] args) {
        int n =9854;
        int rev = 0;
        while (n!=0)
        {
            int num = n%10;
            rev = rev*10+num;
            n=n/10;
        }
        System.out.println("rev is  " +rev);
    }
}
