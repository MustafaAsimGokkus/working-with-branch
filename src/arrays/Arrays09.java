package arrays;

import java.util.Arrays;
import java.util.Comparator;

public class Arrays09 {
    public static void main(String[] args) {
        //find the longest word in a string

      String s = "Ali Can went to school on September";

      String [] arr = s.split(" ");

      Arrays.sort(arr, Comparator.comparingInt(String::length).reversed());
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[0]);

        //get the initials of std names
        String t = "Ali Can, Veli Han, Mary Star went to school by bus";
        String [] names = t.split(", ");
        System.out.println(Arrays.toString(names));//[Ali Can, Veli Han, Mary Star went to school by bus]
        for(int i =0; i<names.length; i++){
        int idxOfSpace = names[i].indexOf(" ");
          String result =  names[i].substring(0,1)
                  +names[i].substring(idxOfSpace+1,idxOfSpace+2);
            System.out.print(result+ " ");
        }

    }
}
