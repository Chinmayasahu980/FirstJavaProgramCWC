package Exception;

public class InvalidotpException extends NullPointerException {
    public String GetMessage()
    {
        return "mismatch OTP";
    }

}
