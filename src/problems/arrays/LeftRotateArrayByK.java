package problems.arrays;

import java.util.Arrays;

public class LeftRotateArrayByK {
    public static void main(String[] args) {
        int[] arr={ 1, 2, 3, 4, 5, 6, 7};
        rotateLeftByK(arr, 2);
        System.out.println(Arrays.toString(arr));
    }
    static void rotateLeftByK(int[] arr, int k){
        //using temp array for rotation
        int[] temp = new int[arr.length];

        /*
            On mapping the index with old and new array, we get 0 => arrlength - k ; 1 => arrlength - k + 1 ;

            and when (arrlength - k + somenumber) reaches end of array its, next index to be filled => 0, and here 2 => 0 ; 3 => 1 and so on

            here initially assigning j with arr.length - k for first rotation
         */
        int j = arr.length - k;

        for (int i = 0; i < arr.length; i++) {
            /*
                Initially, temp[0] = arr[ j (arr.length - k)]
                then, temp[1] = arr[j + 1]...j increases by 1 until j reaches last index of arr then resets to 0
             */
            temp[i] = arr[j];
            j++;

            //resetting j to 0 when end of array is reached
            if(j == arr.length ) j = 0;
        }

        //copying the temp rotated array to the original referenceVariable
        for (int i = 0; i < arr.length; i++) {
            arr[i] = temp[i];
        }
    }
}
