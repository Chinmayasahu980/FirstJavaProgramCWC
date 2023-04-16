package multithreading;

public class C implements Runnable
{
    @Override
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("my child thread");
                Thread.sleep(5000);
            }
        }
        catch(InterruptedException i)
        {

        }
    }
}
class D
{
    public static void main(String[] args) throws InterruptedException {
        C r = new C();

        Thread t = new Thread(r);

        Thread t1 = new Thread(r);
        t1.start();
        for(int i=1;i<=5;i++)
        {
            System.out.println("main Thread");
            Thread.sleep(5000);
        }
    }
}
