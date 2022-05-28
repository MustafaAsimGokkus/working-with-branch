package arrays;

public class ForEach01 {
    public static void main(String[] args) {
     //get the total number of characters in the elements
        String [] s = {"Ali", "Veli Han","Mary Star","Cemalettin", "Yasemin","Sam","Asim"};
     //Do it by using for loop
//       int sum = 0;
//        for(int i=0; i<s.length;i++){
//            sum = sum + s[i].length();
//        }
//        System.out.println("Total number of characters:"+ sum);

        //By for each loop
//        int sumOfChars = 0;
//        for(String w : s){
//            sumOfChars += w.length();
//        }
//        System.out.println(sumOfChars);

        for(String w : s){
            if(w.length()>6){
                System.out.print(w+", ");
            }

        }
        //print the common elements for 2 arrays
        int arr1[]={11,21,33};
        int arr2[]={33,34,11};


        for(int w:arr1){
            for(int x:arr2){
                if (w==x){
                    System.out.println(x);
                }
            }

        }

//       for(int i=0; i<arr1.length; i++){
//           for(int j=0; j<arr2.length; j++){
//               if(arr1[i]==arr2[j]){
//                   System.out.print(arr1[i]+" "); //11 33
//               }
//           }
//       }
    }
}
