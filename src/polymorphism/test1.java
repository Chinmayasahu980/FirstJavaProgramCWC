package polymorphism;

public class test1 {
    public static void main(String[] args) {
        bike b = new bike();
        b.noofwheels();
        vehicle v = new bike();
        v.noofwheels();

        }
    }

