package repeat_constructor;

public class test5 {
    public static void main(String[] args) {
        ticket t1 = new ticket(335,5, 4535);
        ticket t2 = new ticket(124,8,2400);
        ticket t3 = new ticket(258);
        t1.details();
        t2.details();
        t3.details();
    }
}
