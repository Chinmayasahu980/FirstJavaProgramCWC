package multithreading;
public class thread1 extends Thread{
    public void run() {
        String name = Thread.currentThread().getName();

        try {
            for (int i = 1; i <= 3; i++) {
                System.out.println(name);
                System.out.println("t1 is running");
                Thread.sleep(1000);
                Thread.yield();
            }
        }
        catch(InterruptedException i)
        {
            System.out.println("t1 is terminited");
        }
    }
}
class thread2 extends Thread{
    public void run()
    {
        String name =Thread.currentThread().getName();
        for(int i=1;i<=3;i++)
        {
            System.out.println(name);
        }
    }
}
class Chi {
    public static void main(String[] args) {

        thread1 t1 = new thread1();
        thread2 t2 = new thread2();
        thread1 t3 = new thread1();
        t1.start();
        System.out.println(t2.isAlive());
        t2.start();
        t3.start();
        System.out.println(t2.isAlive());
        t1.interrupt();
    }
}