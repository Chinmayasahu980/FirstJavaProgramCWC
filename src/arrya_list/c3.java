package arrya_list;
import java.util.ArrayList;
public class c3 {
    public static void main(String[] args) {
        ArrayList name = new ArrayList();
        name.add("rahul pradhan");
        name.add("chinmaya sahu");
        name.add("saroj kara");
        name.add("suryakanta ");
        for(int i = 0;i<name.size();i++)
        {
            System.out.println(name.get(i));
        }
    }
}
