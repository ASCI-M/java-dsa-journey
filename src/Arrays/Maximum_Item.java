package Arrays;

public class Maximum_Item {
    public static void main(String[] args) {
        int[] arr = {1, 3, 23, 9, 18};
        System.out.println(max(arr));
        System.out.println(maxRange(arr, 1, 3));
    }
    static int max(int[] arr){
        if(arr.length == 0) return -1;

        int maximum = arr[0];
        //using linear search -> O(n)
        for(int num : arr){
            if(num>maximum)  maximum = num;
        }
        return maximum;
    }
    static int maxRange(int[] arr, int lowerBound, int upperBound){

        if(lowerBound>upperBound) return -1;

        if(arr == null) return -1;

        int maximum = arr[lowerBound];
        for (int i = lowerBound; i <= upperBound ; i++) {
            if(arr[i] > maximum) maximum = arr[i];
        }
        return maximum;
    }

}
