package problems.binearysearch.easy;

public class SearchXInSortedArr {
    public static void main(String[] args) {
        int[] arr = {-1,0,3,5,9,12};
        int index = search(arr, 9);
        System.out.printf("Target: %d\tIndex: %d",9 , index);

    }
    public static int search(int[] nums, int target) {
        if(nums.length == 0 ) return -1;

        int low = 0;
        int high = nums.length - 1;

        while(low <= high){
            int mid = low + (high - low) / 2;
            if(nums[mid] == target) return mid;
            else if(nums[mid] > target) high = mid - 1;
            else low = mid + 1;
        }
        return -1;

    }
}
