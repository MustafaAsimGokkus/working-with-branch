package arrays;

import java.util.Arrays;

public class Arrays07 {
    public static void main(String[] args) {
        //check if a specific element - 12  exists in the array
        int[] arr = {12, 5, 14, 8, 5, 9};
        System.out.println(ifExists (arr, 13));

        System.out.println( "Binary search method call:"+Arrays.binarySearch(arr,14));
    }

    public static Boolean ifExists(int [] arr,int num) {
        int counter = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                counter++;
            }
            break;
        }
        boolean b = counter != 0;
        return b;

        }

    }

