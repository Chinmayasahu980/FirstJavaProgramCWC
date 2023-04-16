package Exception;

public class metrimony {
    public void verifyage(int age)
    {
        if(age<25)
        {
            throw new underageException();
        }
        else if(age>45)
        {
            throw new overageException();
        }
        else {
            System.out.println("welcome to mertimony.com");
        }
    }
}
