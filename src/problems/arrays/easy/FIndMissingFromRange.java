package problems.arrays.easy;

public class FIndMissingFromRange {
    public static void main(String[] args) {
        missingInRange(new int[]{8, 2, 4, 5, 3, 7, 1});
        missingInRange(new int[]{1, 3, 2, 4, 6});
    }

    /*
        A.P. formula to find sum of n natural number

        Finding out the actual sum => the missing number is the difference between reqSum and actualSum
     */
    static void missingInRange(int[] arr){
        /*
            as given arrays length is n-1 and range is [1, n]
            1 number is missing from array
            so now, arr.length gives actually n - 1
            and arr.length + 1 = n, and arr.length + 2 is n + 1

            so as per formula sum = n(n + 1) / 2;
         */
        int reqSum = ( (arr.length) * (arr.length + 1) ) / 2;

        int actualSum = 0;

        for (int num : arr) {
            actualSum += num;
        }

        int diff = reqSum - actualSum;

        System.out.printf("The missing number is: %d%n", diff);
    }

}
