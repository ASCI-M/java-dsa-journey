package Arrays;

import java.util.Arrays;

public class PassingInFunctions {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};

        System.out.println(Arrays.toString(nums));

        /*
        we are passing nums but internally a copy of this referenceVariable (named arr) pointing to
         same array is being passed
         */
        change(nums);

        /*
        Hence, now arr is used to change the object and the nums value is also changed as arr and nums
        were pointing to the same object
         */

        System.out.println(Arrays.toString(nums));

    }
    public static void change(int[] arr){
        arr[0] = 99;
    }
}
