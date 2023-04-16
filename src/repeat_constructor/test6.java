package repeat_constructor;

public class test6 {
    public static void main(String[] args) {
        singer s1 = new singer("ar","hindi song","me");
        singer s2 = new singer("teri meri","he self");
        singer s3 = new singer("sdgf");
        s1.details();
        s2.details();
        s3.details();
    }
}
