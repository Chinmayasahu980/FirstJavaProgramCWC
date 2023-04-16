package com.chinmaya;

public class practics_set_6
{
    public static void main(String[] args) {
        /*float [] mark = {45.2f,85.4f,5.2f,8.5f,80.4f};
        float num = 85.2f;
        boolean isinarray= false ;;
        for(float element:mark)
        {
            if(num==element)
            {
                isinarray = true;
                break;
            }
            if(isinarray)
            {
                System.out.println("this value is present in this array");
            }
            else{
                System.out.println("this value is not present in this array");
            }
    }*/
       /* float [] mark = {45.2f,85.4f,5.2f,88.5f,80.4f};
        float sum = 0;
        for(float element:mark)
        {
            sum = sum + element;
        }
        System.out.println("tha value of avarage mark is :  "+sum/mark.length);
*/
     /*   int[][] mat1 = {{5, 8, 6},
                {5, 4, 9}};
        int[][] mat2 = {{3, 9, 6},
                {5, 2, 7}};
        int[][] result = {{0, 0, 0},
                {0, 0, 0}};
        for (int i = 0; i < mat1.length;i++) {
            for (int j = 0; j < mat1[i].length;j++) {
                System.out.format("setting value for i = %d and j = %d\n", i, j);
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        for (int i = 0; i < mat1.length;i++) {
            for (int j = 0; j < mat1[i].length;j++) {
                System.out.format(result[i][j] + " ");
                result[i][j] = mat1[i][j] + mat2[i][j];
            }

       }
  */
        int[]arr={5,6,7,54,85,6};
        int max=0;
        for(int e: arr) {
            if (e > max) {
                max=e;
            }
        }
        System.out.println("tha maximum element of tha array is :" +max);

    }
}