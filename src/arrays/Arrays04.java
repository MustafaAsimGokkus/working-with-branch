package arrays;

import java.util.Arrays;
import java.util.Comparator;

public class Arrays04 {
    public static void main(String[] args) {
   //sort the string array elements in ascending order to their length
    String [] s = {"Miami","Jacksonville","Virginia","Samsun","Tampa","Keywe"};

    Arrays.sort(s, Comparator.comparingInt(String::length));
    System.out.println(Arrays.toString(s));

    Arrays.sort(s,Comparator.comparingInt(String::length).reversed());
    System.out.println(Arrays.toString(s));

    // Sort in descending order, if there is multiple elements in same length
    // put them in alphabetical order

    Arrays.sort(s,Comparator.comparingInt(String::length).reversed()
            .thenComparing(Comparator.naturalOrder()));

    System.out.println(Arrays.toString(s));

    }
}
