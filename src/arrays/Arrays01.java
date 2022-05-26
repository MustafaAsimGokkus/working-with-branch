package arrays;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        System.out.println(Arrays.toString(arr));

    //How to add elemets into an array
        arr[1]=11;

        arr[0]=23;arr[2]=32;arr[3]=12;arr[4]=25;
        System.out.println(Arrays.toString(arr));

        //how to read specific element from an array
        System.out.println(arr[2]);

        //how to get num of elements in an array
        System.out.println(arr.length);//5
//how to get last element from an array dynamically

        System.out.println(arr[arr.length-1]); //25








    }
}
