package com.chinmaya;

public class practics6 {
    public static void main(String[] args) {
        //queation 1;
       /* float[] mark = {5.2f,5.3f,5.4f,5.5f,5.6f};
        float sum = 0;
        for (float element : mark) {
            sum = sum + element;

        }
        System.out.println("tha sum of element is"+sum);
*/
        //q2
        /*float[] mark = {5.2f,5.3f,5.4f,5.5f,5.6f};
        float num = 5.2f;
        boolean avalable = false;
        for (float element : mark)
        {
         if(num==element)
            {
                avalable = true;
                break;
            }
        }
       if(avalable) {
           System.out.println("tha num is avalable in tha element of array");
       }
       else{
           System.out.println("tha is not avalable in tha element of array");
       }

         */
        //q3
       /* float[] mark = {59.2f,95.3f,5.4f,5.5f,5.6f};
        float sum = 0;
        for (float element : mark) {
            sum = sum + element;

        }
        System.out.println("tha avarage of element is   "+sum/mark.length);
        */
        //q4
       /* int[][] mat1 = {{3, 5, 6}, {4, 5, 8}};
        int[][] mat2 = {{7, 8, 9}, {2, 5, 8}};
        int[][] result = {{0, 0, 0}, {0, 0, 0}};
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[i].length; j++) {
                System.out.printf("value for i =%d and j =%d\n", i, j);
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
            for (int i = 0; i < mat1.length; i++) {
                for (int j = 0; j < mat1[i].length; j++) {
                    System.out.print(result[i][j] + " ");
                    result[i][j] = mat1[i][j] + mat2[i][j];
                }
                System.out.println("");
         }
         */
      /*  int[]arr={1,2,3,4,5,6 };
        int l = arr.length;
        int n = Math.floorDiv(l, 2);
        int temp;
        for(int i=0;i<n;i++)
        {
            temp = arr[i];
            arr[i] = arr[l-1-i];
            arr[l-1-i] = temp;
        }
        for(int element:arr)
        {
            System.out.println(element+" ");
        }
*/
        int[]arr={11,22,3,4,55,6 };
        int min=1 ;
        for(int e: arr) {
            if (e < min) {
                min = e;
            }
        }
        System.out.println("tha minimum   "  +min);
        }
    }


