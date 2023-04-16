package multithreading;

public class I extends Thread {
    public void run()
    {
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());

    }
}
class J
{
    public static void main(String[] args) {
        I t1 = new I();
        I t2 = new I();
        I t3 = new I();
        t1.setName("t1 thread");
        t2.setName("t2 thread");
        t3.setName("t3 thread");
        t1.start();
        t2.start();
        t3.start();
        t1.setPriority(5);
        t2.setPriority(3);
        t3.setPriority(6);
    }
}