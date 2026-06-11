package searching;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 6, 4, 9 , 2};
        int index = linearSearch(arr, 13);
        System.out.printf("Target: %d\tIndex: %d",13 , index);
    }
    static int linearSearch(int[] arr, int target){
        if(arr.length == 0) return -1;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}
