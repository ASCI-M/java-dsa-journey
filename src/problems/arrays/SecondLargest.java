package problems.arrays;

public class SecondLargest {
    public static void main(String[] args) {
        System.out.println(secondLargestAndSmallest(new int[]{1}));
        System.out.println( secondLargestAndSmallest(new int[]{1, 5, 6, 2, 4, 4, 6, 7}));
        System.out.println( secondLargestAndSmallest(new int[]{5, 5, 5, 5}));
        System.out.println( secondLargestAndSmallest(new int[]{9, 5, 6, 2, 4, 4, 6, 7}));    }

    /*
        Time Complexity O(N) => 2 linear traversal
        Space Complexity O(1) => constant amount of space for variables
     */
    static String secondLargestAndSmallest(int[] arr){
        // handling edge case of element being 1 or empty array
        if(arr.length == 0 || arr.length == 1) return -1 + " " + -1;
        // setting to min possible value of int for finding largest in array
        int scndLargest = Integer.MIN_VALUE;
        int largest = Integer.MIN_VALUE;

        // setting to max possible value of int for finding smallest in array
        int scndSmallest = Integer.MAX_VALUE;
        int smallest = Integer.MAX_VALUE;

        for (int element : arr){
            // linear search
            if(element > largest){
                largest = element;
            }

            if(element < smallest){
                smallest = element;
            }
        }
        for(int element : arr){
            // finding second-largest element
            if(element > scndLargest && element != largest){
                scndLargest = element;
            }

            // finding second-smallest element
            if(element < scndSmallest && element != smallest){
                scndSmallest = element;
            }
        }
        // edge case of all element of array being same
        if(scndLargest == largest || scndLargest == Integer.MIN_VALUE || scndSmallest == Integer.MAX_VALUE) return -1 + " " + -1;

        return String.format("Second Smallest: %d\t\tSecond Largest: %d", scndSmallest, scndLargest);

    }
}
