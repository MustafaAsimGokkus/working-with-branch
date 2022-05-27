package arrays;

import java.util.Arrays;
import java.util.Comparator;

public class Arrays06 {
    public static void main(String[] args) {
       //check if array is sorted or not
       String[] arr1 = {"Ali","Veli","Mehmet","Koray","Omer"};
       System.out.println("Before sorting:"+ Arrays.toString(arr1));
       String[] arr2 =Arrays.copyOf(arr1,arr1.length);
       Arrays.sort(arr1);
       System.out.println("After sorting:"+ Arrays.toString(arr1));

    if(Arrays.equals(arr1,arr2)){
        System.out.println("sorted");
    }else{
        System.out.println("not sorted");
    }
    }
}
