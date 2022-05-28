package arrays;

import java.util.Arrays;

public class MultiDimensionalArray01 {
    public static void main(String[] args) {
     // how to create 2 dim array
     int arr1 [][]= new int[3][2];
        System.out.println(Arrays.deepToString(arr1));
        arr1[0][0]=2;
        arr1[0][1]=3;
    //    arr1[0][2]=4;

       arr1[1][0]=10;
      arr1[1][1]=11;

       arr1[2][0]=7;
       arr1[2][1]=-2;
//     arr1[2][2]=5;
//     arr1[2][3]=6;
    System.out.println(Arrays.deepToString(arr1));

  int[][] arr3  = {{5,-2,3},{7},{11,45}};

         int sum = 0;
        for (int [] w: arr3) {
            for (int x : w) {
                sum += x;
            }
        }
        System.out.println("Sum of all elements:"+ sum);
        {

        }

    }
}
