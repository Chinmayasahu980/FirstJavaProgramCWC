package prepare_1;

public class para_method2 {
    public static void main(String[] args) {
        vowel('e');
        vowel('I');
        vowel('f');
        vowel('h');
    }
    public static void vowel(char l)
    {
        if (l=='a'||l=='e'||l=='i'||l=='o'||l=='u'||l=='A'||l=='E'||l=='I'||l=='O'||l=='U')
        {
            System.out.println("letter is vowel");
        }
        else
        {
            System.out.println("letter is not a vowel");
        }
    }
}
