package array;

public class prime {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9};
    for(int i = 0;i<arr.length;i++)
    {
        int n = arr[i];
        int c = 0;
        for(int j= 1;j<=n;j++)
        {
            if(n%j == 0) {
                c++;
            if(c==2){
                    System.out.println(n);
        }
            }
    }
        }
    }
    }

