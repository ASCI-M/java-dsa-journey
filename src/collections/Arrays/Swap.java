package collections.Arrays;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] arr = {1, 3, 23, 9, 18};
//      swap(arr, 1, 3);
        reverseArray(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void swap(int[] arr, int index1, int index2){
        //using temporary variable to swap
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    static void reverseArray(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start < end) {
            //swapping using swap()
            swap(arr, start, end);
            start++;
            end--;
        }
    }
}
