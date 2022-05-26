package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays03 {
    public static void main(String[] args) {

     int []arr = new int [6];
     //put zeros to the end
     arr[0]=0; arr[1]=2; arr[2]=3; arr[3]=0; arr[4]=12; arr[5]=0;
     int idx = 0;


     int [] brr = new int[arr.length];
     for(int i=0; i<arr.length; i++){
        if(arr[i] != 0){
          brr[idx]=arr[i];
          idx++;
        }
     }

        System.out.println(Arrays.toString(brr));
    }
}
