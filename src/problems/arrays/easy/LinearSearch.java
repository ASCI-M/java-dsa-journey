package problems.arrays.easy;

public class LinearSearch {

    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 9, 0, 2};
        System.out.println(linearSearch( arr, 7));
    }

    static int linearSearch(int[] arr, int desiredEle) {
        if(arr.length == 0) return -1;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == desiredEle) return i;

        }

        return -1;
    }
}
