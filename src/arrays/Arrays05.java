package arrays;

import java.util.Arrays;

public class Arrays05 {
    public static void main(String[] args) {
       //check if two arrays are same or not
       int[] arr1 = {5,11,9,22,55};
       int[] arr2 = {5,11,9,22,55};
    //1.way
       int counter = 0;

       if(arr1.length == arr2.length){
           for(int i=0; i<arr1.length; i++){
               if(arr1[i] != arr2[i]){
                   counter ++;
                   break;
               }
           }
           if(counter == 1){
               System.out.println("Arrays are not same");
           }else{
               System.out.println("Arrays are same");
           }
           }
       else{
           System.out.println("Arrays are not same");
       }

    // 2. way
        boolean isSame = Arrays.equals(arr1,arr2);
        System.out.println(isSame);
    }
}
