package collections.Arrays;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension_Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*
            1 2 3
            4 5 6
            7 8 9
         */

        //an array of arrays
        int[][] matrix = {
                {1, 2, 3},// 0th index
                {4, 5}, // 1st index
                {6, 7, 8, 9} // 2nd index
        };
        /*
            here [[array], [array], [array]], number of row is fixed but the columns can vary as each element of
            parent array is an object of array on its own. Here java allocates 3 reference slot, each reference
            slot pointing to an independent array hence number of columns doesn't have to be same. Outer array just holds
            reference pointing to where each row lives
        */

        //creating a 2d array object with referenceVariable arr
        int[][] arr = new int[3][3];

        //input
        for (int row = 0; row < arr.length; row++) { // .length in multidimensional array gives number of rows
            // for each column in each row
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }

//        //output
//        for (int row = 0; row < arr.length; row++) { // .length in multidimensional array gives number of rows
//            // for each column in each row
//            for (int col = 0; col < arr[row].length; col++) {
//                System.out.print(arr[row][col] + " ");
//            }
//            System.out.println();//goes to next line after printing each line
//        }
//        for (int row = 0; row < arr.length; row++) {
//            System.out.println(Arrays.toString(arr[row]));// using inbuild Arrays class
//        }

        //enhanced for loop
        for(int[] num : arr){
            System.out.println(Arrays.toString(num));
        }
    }
}
