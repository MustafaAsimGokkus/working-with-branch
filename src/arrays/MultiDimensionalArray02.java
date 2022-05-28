package arrays;

import java.util.Arrays;

public class MultiDimensionalArray02 {
    public static void main(String[] args) {
     // Print the elements which have "a" from a 2 dimensional array
//      String arr1 [][] = {{"java","learn","it"},{"is","easy"}};
//
//      for(String[] w: arr1){
//          for (String x:w) {
//           if(x.contains("a")){
//               System.out.print(x+" ");
//           }
//          }
//      }
    //Convert a 2 dimensional array to one dimensional array


        int sum=0;
        int [][] arr2 = {  {1,2},{3,4,5},{6,7,9,10}     };

        for(int[] w: arr2) {
            sum += w.length;
        }
        int []arr3 = new int[sum];
        int idx = 0;

        for(int [] w : arr2){
        for (int x :w) {
           arr3[idx] = x;
           idx++;
        }

        }
        System.out.println(Arrays.toString(arr3));
    }





    }

