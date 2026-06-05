package sorting;

import java.util.ArrayList;
import java.util.Arrays;

/*
    Uses divide and merge algorithm

    Divides the given array into hypothetical equal parts until an array with single element is reached

    Merges the single element array back to sorted array pair, sorted array pair to block of sorted 4(even) or 3(odd) and so on
*/
public class MergeSort {
    public static void main(String[] args) {
        /*
            Time complexity for Best, Worst and Average case is O(n log n);
            Space complexity  for Best, Worst and Average case is O(n) => due to extra temp array while merging
         */
        int[] arr = {3, 5, 6, 8, 1, 2, 3};
        mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
    static void mergeSort(int[] arr, int low, int high){// low is starting point and high is ending point of each hypothetical array
        /*
            base case: low == high  => as we need to stop when only 1 element is left and that happens when high equals low
            => Eg: mergeSort(arr, 1, 1);  this shows only 1 element is left as high and low has same index
         */
        if(low == high) return;

        // finding mid-value to divide the array hypothetically
        int mid = (low + high) /2;

        // recursive call for first bigger part of divided array
        mergeSort(arr, low, mid);

        // recursive call for second smaller part of divided array
        mergeSort(arr, mid + 1, high);

        // merging the divided array after sorting
        merging(arr, low, mid, high);
    }
   static void merging(int[] arr, int low, int mid, int high){
        /*
            temp data structure to add elements in sorted manner
            This increases the space complexity to O(n);

            can cause boxing overhead problem as arraylist stores Integer each operation or adding and getting needs auto-boxing and unboxing
            hence, performance and memory overhead

            can use int[] temp = new int[high - low + 1];
         */
        ArrayList<Integer> temp = new ArrayList<>();

        // left and right pointers for comparing element
        int left = low;// as first array is low to mid
        int right = mid + 1;// as second array is mid+1 to high

        // running loop until one of the arrays every element is compared/added to temp
        while( (left <= mid) && (right <= high) ){

            // adding elements in ascending order in arraylist
            if(arr[left] <= arr[right]){
                temp.add(arr[left]);
                left++;
            } else{
                temp.add(arr[right]);
                right++;
            }
        }

        // if left has any element left
        while(left <= mid) {
            temp.add(arr[left]);
            left++;
        }
        // if right has any element left
        while(right <= high) {
            temp.add(arr[right]);
            right++;
        }

        // updating the original arr using the temp arraylist.
        for (int i = low; i <= high; i++) {
            arr[i] = temp.get( i - low);
        }
    }

}
