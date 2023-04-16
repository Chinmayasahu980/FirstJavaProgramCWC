package prepare_1;

public class prime {
    public static void main(String[] args) {
        int count = 0;
        int num =32;
        for(int i=1;i<=num;i++)
        {
            if(num%1==0)
            {
                count++;
            }
        }
        if (count%2==0)
        {
            System.out.println(num+ " not prime");
        }
        else
        {
            System.out.println(num+" prime");
        }
    }
}
