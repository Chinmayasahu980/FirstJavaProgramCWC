package programiz;

public class method6 {
    public static void main(String[] args) {
        System.out.println("main start");
        check('a');
        check('4');
        check('%');
        System.out.println("main end");
    }
    public static void check(char ch)
    {
        if ((ch>='a' && ch<='z') || (ch=='A' && ch<='Z'))
        {
            System.out.println("it is a alphabat");
        }
        else if (ch>=48 && ch<57)
        {
            System.out.println("it is a number");
        }
        else{
            System.out.println("it is special charcter");
        }
    }
}
