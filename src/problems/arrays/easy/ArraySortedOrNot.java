package problems.arrays.easy;

public class ArraySortedOrNot {
    public static void main(String[] args) {
        System.out.println(isSorted(new int[]{1, 2, 3, 4, 8, 9 , 0}));
        System.out.println(isSorted(new int[]{1, 2, 3, 4, 8, 9 }));
    }
    static boolean isSorted(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            //if next element is smaller than initial it isn't sorted
            if(arr[i] > arr[i+1]){
                return false;
            }
        }
        return true;

    }
}
