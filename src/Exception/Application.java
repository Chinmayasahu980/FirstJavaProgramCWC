package Exception;

import javax.swing.*;

public class Application {

    public static void verifyotp(int otp) {

        if (otp ==1234) {
            System.out.println("successfully verified");
        }
        else {
            throw new InvalidotpException();
        }
    }
}