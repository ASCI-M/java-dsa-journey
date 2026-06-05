package sorting;

import java.util.Arrays;

 
//selection puts smallest number in front and only does 1 swap  per iteration
public class SelectionSort {
    public static void main(String[] args) {
         
        // Time complexity = O(n^2) ( not a good time complexity )
        int[] arr = {7, 8, 3, 1, 2};

        for (int i = 0; i < arr.length - 1; i++) {
             /*
                assuming arr[0] is smallest then changing the value of smallest with actual smalles value by comparing with other elements
                then swapping smallest with arr[0]

                then in next loop smallest will be arr[1] then comparing arr[1] with each element and getting second-smallest number
                then swapping smallest with arr[1] now and so on...
              */
            int smallest = i;
             /*
                i+1 in j as need to compare with next coming element

                in bubbleSort last element was being decreased(j<arr.length-i-1) but here 1st element is being increased(j=i+1)
             */
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[smallest] > arr[j]) {
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}