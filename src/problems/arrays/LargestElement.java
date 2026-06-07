package problems.arrays;

public class LargestElement {
    public static void main(String[] args) {
        int[] arr = {4, 6, 2, 3, 4, 10, 32, 5};
        System.out.println("Largest element: " + largest(arr));
    }
    static int largest(int[] arr){
        if(arr.length == 0) return -1;

        // using linear search
        int largestEle = arr[0];
        for (int element : arr) {
            // updating largest element value
            if(element > largestEle) largestEle = element;
        }
        return largestEle;

    }
}
