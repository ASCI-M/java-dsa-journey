package problems.arrays.easy;

public class MaxConsecutives {
    public static void main(String[] args) {
        System.out.println(maximumConsecutives(new int[]{1, 0, 1, 0, 1, 1}));
    }
    static int maximumConsecutives(int[] arr){
        // tracks max 1s
        int max1s = 0;
        //tracks current number of 1s
        int numberOf1 = 0;
        for (int nums : arr) {
            //if 1 encountered numberOf1++
            if (nums == 1) {
                numberOf1++;
            } else {//when consecutive 1s broken reset the counter
                numberOf1 = 0;
            }
            //checks in every iteration if numberOf1 has reached a value greater than numberOf1, if yes updates max1s
            if (max1s < numberOf1) {
                max1s = numberOf1;
            }
        }
        return max1s;
    }
}
