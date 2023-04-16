package array;

public class vowel {
    public static void main(String[] args) {
        char[] ch = {'c','h','i','n','m','a','y','a'};
        for(int i = 0;i<ch.length;i++){
            if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'){
                System.out.println(ch[i]);
            }
        }
    }
}
