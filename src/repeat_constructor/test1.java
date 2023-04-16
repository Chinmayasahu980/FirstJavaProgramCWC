package repeat_constructor;

public class test1 {
    public static void main(String[] args) {
        status1 s1 = new status1("chinmaya", 8847871971l, 8.36f);
        s1.details();
        status1 s2 = new status1("sahu", 9438399589l, 9.35f);
        s2.details();
        status1 s3 = new status1("rahul", 6547893215l);
        s3.details();
        status1 s4 = new status1("pradhan");
        s4.details();
    }
}
