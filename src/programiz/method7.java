package programiz;

public class method7 {
    public static void main(String[] args) {
       float res= area(25);
        System.out.println(res);
    }
    public static float area(float r)
    {
        float pi = 3.13f;
        float radius = r*r*pi;
        return radius;
    }
}
