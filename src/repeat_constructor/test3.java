package repeat_constructor;

public class test3 {
    public static void main(String[] args) {
        vedio v1 = new vedio("new",15.35f,"mp4");
        v1.details();
        vedio v2 = new vedio("chinmaya",85.3f,"mp4");
        v2.details();
        vedio v3 = new vedio("sahu",85.5f);
        v3.details();
        vedio v4 = new vedio("rahul");
        v4.details();
    }
}
