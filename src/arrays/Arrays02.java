package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays02 {
    public static void main(String[] args) {
       //get the elements from a user and create an array
       Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of the array");
       int length = scan.nextInt();
       String []arr = new String[length];
       for(int i =0; i<length; i++){
           System.out.println("Enter "+(i+1)+". element");
           arr[i] = scan.next();
       }
        System.out.println(Arrays.toString(arr));

    //   ali veli samil ==> veli samil ali;

        String [] arr22 = new String [3];
        arr22[0]="ali";
        arr22[1]="veli";
        arr22[2]="samil";

        String [] newArr = new String [3];
        newArr [0]=arr22[1];
        newArr [1]=arr22[2];
        newArr [2]=arr22[0];
        System.out.println(Arrays.toString(newArr));

    }
}
