package problems.arrays.medium;

import java.util.Arrays;

public class SortColors {
    public static void main(String[] args) {
        int[] arr = {2,0,2,1,1,0};
        sortColors(arr);
        System.out.println(Arrays.toString(arr));
    }
    static public void sortColors(int[] nums) {
        int i = 0;
        int v = -1;
        int c =  nums.length - 1;
        while ( i < nums.length ){

            if(nums[i]==0){
                int temp = nums[v + 1];
                nums[v+1] = nums[i];
                nums[i] = temp;
                v++;
                i++;
            }else if(nums[i] == 2) {
                if(i<c){
                System.out.println(2);
                int temp = nums[i];
                nums[i] = nums[c];
                nums[c] = temp;
                c--;
                }
                else i++;
            }else{
                i++;
            }
        }
    }
}
