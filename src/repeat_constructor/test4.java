package repeat_constructor;

public class test4 {
    public static void main(String[] args) {
        file f1 = new file("chinmaya","mp4",58);
        f1.details();
        file f2 = new file("rahul","vlc");
        f2.details();
        file f3 = new file("sahu");
        f3.details();
        System.out.println(f3.fname);
    }
}
