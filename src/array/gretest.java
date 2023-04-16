package array;

public class gretest {
    public static void main(String[] args) {
        int[] arr =new int[] {54,16,49,6,23,25,42,11,8,52};
        int max=1;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] > max)
                max = arr[i];
        }
        System.out.println(max);
    }
}
