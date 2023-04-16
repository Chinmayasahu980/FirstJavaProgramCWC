package Exception;

public class c1 {
    public static void main(String[] args) {
        String name = "leila";
        try {
            char ch = name.charAt(3);
            System.out.println(ch);
        }
        catch(StringIndexOutOfBoundsException e)
        {
            System.out.println("Index is out of bound");
        }
    }
}
