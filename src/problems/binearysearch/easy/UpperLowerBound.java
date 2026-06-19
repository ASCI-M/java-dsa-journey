package problems.binearysearch.easy;

import java.util.Arrays;

public class UpperLowerBound {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3};
        int indexL = lowerBound(arr.length, arr, 2);
        System.out.println(Arrays.toString(arr));
        System.out.printf("Lower -> Key: %d\tIndex: %d\n", 2,  indexL);
        int indexU = upperBound(arr.length, arr, 2);
        System.out.printf("Upper -> Key: %d\tIndex: %d\n\n", 2,  indexU);

        int[] arr1 = {3,5,8,9,15,19};
        int indexL1 = lowerBound(arr1.length, arr1, 9);
        System.out.println(Arrays.toString(arr1));
        System.out.printf("Lower -> Key: %d\tIndex: %d\n", 9, indexL1);
        int indexU1 = upperBound(arr1.length, arr1, 9);
        System.out.printf("Upper -> Key: %d\tIndex: %d", 9 ,  indexU1);
    }
    static int lowerBound(int n, int[] arr, int key){
        if(arr.length == 0) return -1;

        int low = 0;
        int high = arr.length - 1;

        int mid = -1;
        int smallest = n; // default value to return
        int current;
        while(low <= high){
            mid = low + (high - low) / 2;

            if(arr[mid] >= key){
                if(mid < smallest) {
                    smallest = mid;
                }
                high = mid - 1;

            }
            else low = mid + 1;
        }
        return smallest;
    }
    static int upperBound(int n, int[] arr, int key){
        if(arr.length == 0) return -1;

        int low = 0;
        int high = arr.length - 1;

        int mid = -1;
        int smallest = n; // default value to return
        int current;
        while(low <= high){
            mid = low + (high - low) / 2;

            if(arr[mid] > key){
                if(mid < smallest) {
                    smallest = mid;
                }
                high = mid - 1;

            }
            else low = mid + 1;
        }
        return smallest;
    }
}
