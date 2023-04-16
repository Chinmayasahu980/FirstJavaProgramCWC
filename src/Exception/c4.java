package Exception;

public class c4 {
    public static void main(String[] args) {
        Application a = new Application();
        try
        {
            a.verifyotp(1234);
        }
        catch(InvalidotpException e)
        {
            System.out.println(e.GetMessage());
        }
    }
}
