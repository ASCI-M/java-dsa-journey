package sorting;

import java.util.Arrays;

/*
    Bubble sort puts the largest element at last position by swapping as many times needed
    then second largest in second last position by swapping as many times as needed and so on...
 */
public class BubbleSort
{
    public static void main(String[] args){

        // Time complexity = O(n^2) ( not a good time complexity )
        int[] arr = {1, 0, 9, 16, 100};

        // loop till n-1 as in comparison the smallest number will be sorted and pushed automatically in 0th index until last loop
        for(int i=0 ; i<arr.length-1 ; i++){

            // cause in 1st loop the largest element will be sent to last so next time I need to run the loop i fewer times so -i
            for( int j=0 ; j<arr.length-i-1 ; j++){

                // cause actual element is nested in j and i is just a counter to run entire program for n-1 times
                if(arr[j] > arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
