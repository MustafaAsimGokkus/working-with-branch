package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ForEach02 {
    public static void main(String[] args) {
        int sum = 0;

    //find the vowels in a string by using arrays
      String s = "Learn Java earn money";
      String []arr = s.split(" ");
        System.out.println(Arrays.toString(arr));
//        for(String w:arr){
//            if(  w.equalsIgnoreCase("a")
//                    ||w.equalsIgnoreCase("e")
//                    ||w.equalsIgnoreCase("i")
//                    ||w.equalsIgnoreCase("o")
//                    ||w.equalsIgnoreCase("u")
//            ){
//                System.out.print(w+" ");
//            }
//        }
        //print the words ending with "n"
//        for(String w:arr){
//            if(w.endsWith("n")){
//                System.out.print(w+" ");
//            }
//        }

        //find the sum of the digits of an integer given by user by using arrays
       Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer");
        String n = scan.next();
        String[] num = n.split("");
        System.out.println(Arrays.toString(num));

        for(String w: num){

            Integer x = Integer.valueOf(w);
            sum += x;
        }
        System.out.println("Sum of digits:"+sum);
    }
}
