package arrays;

import java.util.Arrays;

public class MultiDimensionalArray03 {
    public static void main(String[] args) {

        //find the maximum element in 2 dimensional array
    int arr [][] = {{11,21},{-5,34},{65,22,31}};

       int length = 0;

        for (int [] w:arr) {
          length += w.length;
        }

        int [] brr =  new int [length];
        int idx = 0;
        for(int [] w : arr){
           for(int x : w){
            brr [idx] = x;
            idx++;
           }
       }
       int result = Integer.MAX_VALUE;

       for (int z : brr){
           if(z < result){
               result = z;
           }
       }
        System.out.println("The smallest element is: "+ result);
    }
   }

