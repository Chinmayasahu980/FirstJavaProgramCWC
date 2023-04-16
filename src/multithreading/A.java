package multithreading;
public class A extends Thread{
    @Override
    public void run() {
        try {
            for (int i = 1; i < 5; i++) {
                System.out.println("chinmaya");
                Thread.sleep(5000);
            }
        }
        catch(InterruptedException i)
        {

        }
    }
}
 class B{
    public static void main(String[] args) throws InterruptedException {

        A t1=new A();
        t1.start();
        A t = new A();
        t.start();
        for(int j=1;j<5;j++)
        {
            System.out.println("sahu");
            Thread.sleep(1000);
        }
    }
}
