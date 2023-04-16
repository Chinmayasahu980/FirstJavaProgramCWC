package polymorphism;

public class test6 {
    public static void main(String[] args) {
        msoffice m = new msword();
        m.save();
        m.saveas();
        m.write();
        msword m1 = new msword();
        m.write();
        m.save();
        m.saveas();
    }

}
