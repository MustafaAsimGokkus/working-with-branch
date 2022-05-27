package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays08 {
    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter a string");
//        String str = scan.nextLine();
//
//        String[]words = str.split(" ");
//        System.out.println(Arrays.toString(words));
//        Arrays.sort(words);

        //count how many words starts with "s"
        String []array = {"Sweden","Finnland","Danemark","Germany","Sao Lome","Bhutan"};
        System.out.println(startsWith(array,"S")); //2

    }
    public static int startsWith(String[]arr, String x){
        int counter = 0;
        for(int i=0; i<arr.length; i++){
            if (arr[i].startsWith(x)  ){
               counter ++;
            }
        }
        return counter;
    }
}
