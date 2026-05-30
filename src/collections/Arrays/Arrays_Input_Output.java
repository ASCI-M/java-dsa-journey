package collections.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_Input_Output {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        // array of primitives
//        int[] arr = new int[5];
//        arr[0] = 12;
//        arr[1] = 1245;
//        arr[2] = 126;
//        arr[3] = 67;
//        arr[4] = 32;
//        // internally : [12, 1245, 126, 67, 32]
//
//        //initializing this way is time-consuming so we use for-loops
//
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = in.nextInt();
//        }
//
//        //printing can be done using for-loop too
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//
//        //using for-each loop -> used when we don't need indexes, just the value
//        for (int i : arr){
//            System.out.print(i + " ");//here i represents each element of arr
//        }
//
//        //easiest way of printing array is using Arrays class
//        System.out.println(Arrays.toString(arr));// converts the inputted array in string and simply prints it
//        //toString internally uses StringBuilder with .append() and for-loop
//
//       // System.out.println(arr[5]); index out of bound

        //array of objects
        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));

        //modifying the array
        str[1] = "Modit";
        //here reference variable is str[1] pointing to string object "Modit"
        
        System.out.println(Arrays.toString(str));
    }
}
