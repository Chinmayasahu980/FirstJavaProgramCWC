package multithreading.sincronization;
class msg {
    public synchronized void show(String name) {

        for (int i = 1; i <= 3; i++) {
            System.out.println("how are u " + name);
        }
    }
}
class OurThread extends Thread {
    msg m;
    String name;

    OurThread(msg m, String name) {
        this.m = m;
        this.name = name;
    }

    public void run() {
        m.show(name);
    }
}
     class SynBlock{

       public static void main(String [] args)
       {
            msg m = new msg();
            msg m2 = new msg();
            OurThread t1 = new OurThread(m,"chinmaya");
            OurThread t2 = new OurThread(m,"sahu");
           OurThread t3 = new OurThread(m2,"sahu");
           OurThread t4 = new OurThread(m2,"sahu");
            t1.start();
            t2.start();
            t3.start();
            t4.start();

       }
    }
