package searching.binearysearch;

public class IterativeMethod {
    public static void main(String[] args) {
        int[] arr ={1, 4, 2, 6, 4, 9 , 2};
        int index = iterationBinarySearch(arr, 13);
        System.out.printf("Target: %d\tIndex: %d",13 , index);
    }
    static int iterationBinarySearch(int[] arr, int target){

        if( arr.length == 0) return -1;

        int low = 0;
        int high = arr.length - 1;

        while(low <= high){
            int mid = (high + low) / 2;

            if(arr[mid] == target) return mid;
            else if (arr[mid] < target) low = mid + 1;
            else high = mid - 1;
        }

        return -1;
    }
}
