package multithreading;

public class H extends Thread {
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
class Chinmaya {
    public static void main(String[] args) {

        thread1 t1 = new thread1();
        t1.start();
        t1.interrupt();


    }
}
