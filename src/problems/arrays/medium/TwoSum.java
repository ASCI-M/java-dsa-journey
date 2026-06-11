package problems.arrays.medium;
import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{3, 3}, 6)));
        System.out.println(Arrays.toString(twoSum(new int[]{2, 3, 4}, 6)));
        System.out.println(Arrays.toString(twoSum(new int[]{2,7,11,15}, 26)));
    }
    static public int[] twoSum(int[] arr, int target){
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            /*
            checking first then putting to avoid answer as [0, 0] for cases like {3, 3} target 6
             */

            /*
                target = (req)any other present element + current
                req = target - current
             */
            int req = target - arr[i];
            //since our key is element and index is value
            if(map.containsKey(req)) {
                // smaller index then bigger index as item insertion from left to right
                int[] output = new int[]{map.get(req), i};
                return output;
            }
            //adding element in map as {  = Index} { value = key}
            map.put(arr[i], i);
        }
        return (new int[]{-1,-1});
    }
}
