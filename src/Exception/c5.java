package Exception;

public class c5 {
    public static void main(String[] args) {
        metrimony m = new metrimony();
        try {
            m.verifyage(26);
        }
        catch (underageException e)
        {
            System.out.println(e.GetMessage());
        }
        catch (overageException e)
        {
            System.out.println(e.GetMessage());
        }
    }
}
