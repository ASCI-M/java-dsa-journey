package problems.arrays;

import java.util.Arrays;

public class RemoveDuplicateFromSorted {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 2, 3, 4, 5, 5, 5, 6, 6, 7};
        removingDuplicate(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void removingDuplicate(int[] arr){
        if (arr.length == 0) return;
        int i = 0;
        for (int  j = 1; j < arr.length  ; j++) {
            //if unique element is encountered put it in unique array area
            if( arr[i] != arr[j]){
                // increase i by 1 when unique element are found, so that unique element sits one after another for the result
                i++;
                arr[i] = arr[j];
            }
        }
    }
}
