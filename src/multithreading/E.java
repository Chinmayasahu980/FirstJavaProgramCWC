package multithreading;

public class E extends Thread {
    public void run()
    {
        String n= Thread.currentThread().getName();
        for(int i=1;i<=3;i++)
        {
            System.out.println(n);
        }
    }
}
class F
{
    public static void main(String[] args) {
        E t1 = new E();
        E t2 = new E();
        E t3 = new E();

        t1.setName("thread 1");
        t2.setName("thread 2");
        t3.setName("thread 3");

        t1.start();
        t2.start();
        t3.start();
    }
}