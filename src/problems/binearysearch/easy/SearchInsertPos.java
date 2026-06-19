package problems.binearysearch.easy;

public class SearchInsertPos {
    public static void main(String[] args) {
        int[] arr = {1, 3,5, 6};
        int index = positionToInsert(arr, 2);

        int index1 = positionToInsert(arr, 4);

        System.out.printf("x: %d\tIndex to enter at: %d\n", 2, index);
        System.out.printf("x: %d\tIndex to enter at: %d", 4, index1);
    }
    static int positionToInsert(int[] arr, int x){

        if( arr.length == 0) return -1;

        int low = 0;
        int high = arr.length - 1;

        int mid = arr.length;
        while(low <= high){
            mid = (high + low) / 2;

            if(arr[mid] == x) return mid;
            else if (arr[mid] < x) low = mid + 1;
            else high = mid - 1;
        }

        return low;
    }
}
