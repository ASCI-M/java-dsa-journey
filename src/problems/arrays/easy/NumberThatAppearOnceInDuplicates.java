package problems.arrays.easy;

public class NumberThatAppearOnceInDuplicates {
    public static void main(String[] args) {
        System.out.println(appearOnce(new int[]{1, 2, 1, 2, 3}));
        System.out.println(appearOnce(new int[]{4,1,2,1,2}));
    }
    static int appearOnce(int[] arr){
        int seenOnce = 0;
        for(int element : arr){
            /*
                Using bitwise operator XOR, it is commutative and associative
                here 1^2 only  doesn't happen, here 1^2^1^2^3 = 0^0^3 happens

                any element XORed with itself is 0
                any element XORed with 0 is itself

                Here seenOnce initially 0 so seenOnce will be updated in first iteration as 1st element
                 then if duplicate encountered becomes 0
                 if new element encountered becomes that element as only 1 element is non-duplicate in provided array
             */
            seenOnce ^= element;
        }
        return seenOnce;
    }
}
