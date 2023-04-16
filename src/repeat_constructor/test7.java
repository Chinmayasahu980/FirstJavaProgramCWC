package repeat_constructor;

public class test7 {
    public static void main(String[] args) {
        rose r = new rose("jack");
        System.out.println(r.getBoyfriend());
        rose r2 = new rose("chetan");
        System.out.println(r.getBoyfriend());
    }
}
