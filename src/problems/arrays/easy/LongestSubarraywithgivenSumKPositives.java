package problems.arrays.easy;

public class LongestSubarraywithgivenSumKPositives {
    public static void main(String[] args) {
        System.out.println(longestSubArray(new int[]{10, 9, 5, 2, 7, 1, 9}, 15));
        System.out.println(longestSubArray(new int[]{2, 3, 5}, 5));
        System.out.println(longestSubArray(new int[]{ 1, 2, 1, 3}, 3));
    }

    static int longestSubArray(int[] arr, int k) {

        //using 2 pointer

        int sum = 0;//to track the sum of current subArray
        int left = 0;// low pointer
        int right = 0;// high pointer
        int longestSubArray = 0;// to store the largest subArray
        int subArray = 0;// to store current subarray
        while (right < arr.length ) {// running loop until right traverses through the array
            if(sum < k ){ // if sum hasn't been achieved
                sum += arr[right];//add current element to sum
                right++;// and increase the window
            } else if(sum == k) {// if sum is exactly reached
                sum -= arr[left];// to start new window => decrease the current left pointer value
                left++;// move left pointer to one step right for new window
            } else {// if sum is greater than target
                sum -= arr[left];// decrease left pointer to make new window by moving left up
                left++;// moving left pointer up
            }

            //evaluating subArray len in every iteration
            subArray = right - left ;
            //reevaluating longestSubArray value in each iteration
            if( longestSubArray < subArray){
                longestSubArray = subArray;
            }
        }
        return longestSubArray;
    }
}
