package searching.binearysearch;

public class RecursiveMethod {
    public static void main(String[] args) {
        int[] arr ={1, 4, 2, 6, 4, 9 , 2};
        int index = recursiveBinarySearch(arr, 9, 0, arr.length - 1);
        System.out.printf("Target: %d\tIndex: %d",9 , index);
    }
    static int recursiveBinarySearch(int[] arr, int target, int low, int high){
       if(low > high) return - 1;

       int mid = (low + high) /2;

       if (arr[mid] == target) return mid;
       else if (arr[mid] > target) return recursiveBinarySearch(arr, target, low, mid-1);
       else return recursiveBinarySearch(arr, target, mid + 1, high);
    }
}
