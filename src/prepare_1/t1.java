package prepare_1;

public class t1 {
    public static void main(String[] args) {
        student s1 = new student("leila",17);
        student s2 = new student("shila",45);
        student s3 = s1;
        System.out.println(s1.toString());
        System.out.println(s2);
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s3));
    }
}
