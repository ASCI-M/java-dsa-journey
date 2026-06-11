package problems.arrays.easy;

import java.util.ArrayList;

public class UnionOfTwoArray {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6,7,8,9,10};
        int[] arr2 = {2,3,4,4,5,11,12};
        union(arr1, arr2);
}
    static void union(int[] arr1, int[] arr2){
        //using merging technique from merge sort
        ArrayList<Integer> union = new ArrayList<>();
        int leftArr1 = 0, leftArr2 = 0;//two left side low pointers
        int rightArr1 = arr1.length - 1, rightArr2 = arr2.length - 1;// two right side high pointers

        while(leftArr1 <= rightArr1 && leftArr2 <= rightArr2){
            if( arr1[leftArr1] < arr2[leftArr2]) {
                //adding only when the list is either empty or when the current element is not equal to last added element
                if (union.isEmpty() || union.get(union.size() - 1) != arr1[leftArr1]){
                    union.add(arr1[leftArr1]);
                }
                leftArr1++;
            } else if (arr1[leftArr1] > arr2[leftArr2]) {
                if (union.isEmpty() || union.get(union.size() - 1) != arr2[leftArr2]){
                    union.add(arr2[leftArr2]);
                }
                leftArr2++;
            } else {
                if (union.isEmpty() || union.get(union.size() - 1) != arr1[leftArr1]){
                    union.add(arr1[leftArr1]);
                }
                leftArr2++;
                leftArr1++;
            }
        }

        //adding remaining elements

        while (leftArr1 <= rightArr1){
            if (union.isEmpty() || union.get(union.size() - 1) != arr1[leftArr1]){
                union.add(arr1[leftArr1]);
            }
            leftArr1++;
        }
        while (leftArr2 <= rightArr2){
            if (union.isEmpty() || union.get(union.size() - 1) != arr2[leftArr2]){
            union.add(arr2[leftArr2]);
            }
            leftArr2++;
        }
        System.out.println(union);
    }
}
