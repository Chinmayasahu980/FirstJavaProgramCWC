package polymorphism;

public class claculator {

    public static int area(int a)
    {

        return a;
    }
    public static float area(float a)
    {

        return a;
    }

    public static void main(String[] args) {

        System.out.println(area(856));
        System.out.println(area(75.699f));

    }
}
