package sorting;
/*
    The array is divided into 2 section sorted and unsorted
    Initially just the 1st element is sorted and rest of array is unsorted
    By comparing unsorted 1st element with sorted all element we determine the position of where the element must be inserted in sorted section
*/
public class InsertionSort
{
    public static void main(String[] args){

        // Time complexity = O(n^2)
        int[] arr = {7,8,3,2,1};

        // initially sorted is just first element and unsorted is rest of array
        for(int i=1 ; i<arr.length ; i++) {
            int unsorted = arr[i];

            int sorted = i-1;

            /*
                sorted>=0 for IndexOutOfBoundException as we will perform sorted--
                and comparison to know right position where unsorted element must be kept
            */
            while(sorted >= 0 && unsorted < arr[sorted]){
                /*
                    pushing the larger element of sorted one step ahead,
                    that is the last element of sorted is pushed in unsorted section to make space for adding unsorted element in right position
                */
                arr[sorted+1]=arr[sorted];

                // decreasing the sorted value to again check and determine the correct position of where the unsorted element must be inserted
                sorted--;
            }

            // since before loop termination we did the operation sorted--, so now we add the unsorted element in sorted+1
            arr[sorted+1] = unsorted;
        }
    }
}
