package sorting;

import java.util.Arrays;
/*
    Divide and conquer

    Pick a pivot number, place the pivot number at exactly where it be in a sorted array.

    left side of pivot number is unsorted block of smaller elements, right side of pivot number is unsorted block of bigger elements

    perform same steps to right and left block using recursive pattern, until the array is sorted
 */
public class QuickSort {
    public static void main(String[] args) {
        /*
            Time Complexity => O(n log n)
            Space Complexity => O(1)

            Arrays.sort() also use this technique, with 2 pivots
         */
        int[] arr = {9, 8, 7, 1, 2, 3};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
    static void quickSort(int[] arr, int low, int high){
        //ensuring that there are more than 1 element in the array
        if(low < high){
            /*
                Determining the pivoted numbers index, as it forms partition between 2 unsorted smaller array

                Left side of pivotedIndex that is pivotedIndex - 1 is high index for unsorted block of smaller elements than pivot number
                Right side of pivotedINdex that is pivotedIndex + 1 is low index for unsorted block of larger elements than pivot number
             */
            int pivotIndex = pivotPlacement(arr, low, high);

            //using recursion by implementing divide and conquer

            // for left array block of smaller elements
            quickSort(arr, low, pivotIndex - 1);
            // for right array block of larger elements
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    static int pivotPlacement(int[] arr, int low, int high){
        // picking the 1st element of array as pivot element
        int pivot = arr[low];
        // i as left pointer
        int i = low;
        // j as right pointer
        int j = high;

        /*
            have to swap i and j until they cross each other so i < j

            the end point index of j is the index the pivot number should be inserted
         */
        while(i < j){
            /*
                increasing the value of i such that it stops at an index
                when arr[i] > pivot number as we need to swap greater number and send it to right side of pivots position
             */
            while(arr[i] <= pivot && i <= high - 1) i++;
            /*
                decreasing the value of j such that it stops at an index
                when arr[j] < pivot number as we need to swap smaller number and send it to left side of pivots position
             */
            while (arr[j] > pivot && j >= low + 1) j--;

            /*
                since we are performing i++ and  j-- then swapping, we need to ensure that
                swap only happens when i is less than j and not when i and j have crossed each other
             */
            if(i < j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        /*
            When i < j in while becomes false, that is i and j have crossed each other

            swapping the pivoted number with j as left of j is smaller than pivoted and right is bigger than pivoted
         */
        arr[low] = arr[j];
        arr[j] = pivot;
        // returning pivoted index to be used for further recursion of smaller left and right blocks
        return j;
    }
}
