package prepare_1;

public class method2 {
    public static void main(String[] args) {
        System.out.println("start");
        lastdigit();
        System.out.println("end");
    }
    public static void lastdigit()
    {
        int num = 45875;
        int last_digit = num%10;
        System.out.println(last_digit);
    }
}
