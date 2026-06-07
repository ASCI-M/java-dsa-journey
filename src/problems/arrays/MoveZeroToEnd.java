package problems.arrays;

import java.util.Arrays;

public class MoveZeroToEnd {
    public static void main(String[] args) {
        int[] arr = { 1, 0, 2, 0, 0, 3, 3, 4, 0, 5};
        movingZero(arr);
        System.out.println(Arrays.toString(arr));
    }
    /*
        Using 2 pointers
        slow pointer will track the position of where non-zero element should be
        fast pointer will track the position of next non-zero number after a zero has been encountered
     */
    static void movingZero(int[] arr){
        if(arr.length == 0 || arr.length == 1) return;
        // slow pointer
        int i = 0;
        for (int j = 0; j < arr.length ; j++) {
            /*
                when 0 isn't encountered by fast pointer, that is when non-zero number is encountered after a series of 0's
                swapping that non-zero element with slow pointer position which has the next position of non-zero element to be kept
             */
            if(arr[j] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
            System.out.println(Arrays.toString(arr));

        }
    }
}
