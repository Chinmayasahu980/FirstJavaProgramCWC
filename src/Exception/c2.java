package Exception;

public class c2 {
    public static void main(String[] args) {
        int a = 20;
        int b = 0;
        try
        {
            int c = a/b;
            System.out.println(c);
        }
        catch(NullPointerException e)
        {
            System.out.println("can't devided by 0");
        }
        catch(ArithmeticException e)
        {
            System.out.println("can't devided");
        }
        catch (Throwable e)
        {
            System.out.println("some thing want wrong");
        }
    }
}
