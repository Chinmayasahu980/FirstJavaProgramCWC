package repeat_constructor;
public class photo {
    double height;
    double breath;
    public photo(double height, double breath) {
        this.height = height;
        this.breath = breath;
    }

    public void details()
    {
        System.out.println(height);
        System.out.println(breath);
    }
    public static void main(String[] args) {
        photo p1 = new photo(15.35, 7.6);
        p1.details();
        photo p2 = new photo(45.3, 8.69);
        p2.details();
    }
}