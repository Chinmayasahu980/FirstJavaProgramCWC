package Exception;
public class c3 {
    public static void main(String[] args)
    {
        System.out.println("start");
        try
        {
            m1();
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        System.out.println("end");
    }
    public static void  m1() throws InterruptedException
    {
        Thread.sleep(5000);
    }
}
