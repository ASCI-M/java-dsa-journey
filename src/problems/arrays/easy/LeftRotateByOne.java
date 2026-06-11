package problems.arrays.easy;

import java.util.Arrays;

public class LeftRotateByOne {
    public static void main(String[] args) {
        int[] arr = {0 ,-1, 2, 1, 8, 6};
        leftRotate(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void leftRotate(int[] arr){
        //keeping 1st element in buffer to add at end
        int buffer = arr[0];
        //shifting each element to left
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        // inserting first element to last for overall left shift
        arr[arr.length -1 ] = buffer;
    }
}
