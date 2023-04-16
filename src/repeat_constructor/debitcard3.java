package repeat_constructor;

public class debitcard3 {
    private String name;
    private int cno;
    private int cvv;

    public debitcard3(String name) {
        this.name = name;
    }

    public debitcard3(String name, int cno) {
        this.name = name;
        this.cno = cno;
    }

    public debitcard3(String name, int cno, int cvv) {
        this.name = name;
        this.cno = cno;
        this.cvv = cvv;
    }

    public void details() {
        System.out.println(name);
        System.out.println(cno);
        System.out.println(cvv);
    }

    public static void main(String[] args) {
        debitcard3 d1 = new debitcard3("Chinmaya sahu", 5289, 963);
        d1.details();
        debitcard3 d2 = new debitcard3("rahul pradhan", 8596, 785);
        d2.details();
    }
}

