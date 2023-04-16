package multithreading.sincronization;

public class Bus implements Runnable{
    int avalable = 2;
    int passenger =1 ;

    public synchronized void run()
    {
        String name =Thread.currentThread().getName();
        if(avalable>=passenger)
        {
            System.out.println(name+" Reversed seat..!");
            avalable=avalable-passenger;
        }
        else
        {
            System.out.println(name + " Sorry seat not avalable..!");
        }
    }
}
class Customer {
    public static void main(String[] args) {
        Bus r = new Bus();
        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);
        Thread t3 = new Thread(r);
        t1.setName("Ram");
        t2.setName("shyam");
        t3.setName("Raju");
        t1.start();
        t2.start();
        t3.start();

    }
}
