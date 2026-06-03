package Generics_Concepts_Using_ArrayLists;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaFunctions {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arr.add(i + 1);
        }

//        //forEach() uses consumer a functional interface
//        arr.forEach((item) -> {
//            //here item is every single element in arr
//            System.out.println(item * 2);
//        });
                    //OR
        //Storing the lambda function in a variable
        Consumer<Integer> fun = item ->  System.out.println(item * 2);

        //storing various operation code in variable of type interface operation
        //works as body of abstract method
        Operation sum = (a, b) -> a + b;
        Operation product = (a, b) -> a * b;
        Operation subtraction = (a, b) -> a - b;

        LambdaFunctions myCalc = new LambdaFunctions();

        //actually using that made lambda function to execute operations
//      System.out.println(myCalc.operate(5, 3, (a, b) -> a + b));
        System.out.println(myCalc.operate(5, 3, sum));
        System.out.println(myCalc.operate(5, 3, product));
        System.out.println(myCalc.operate(5, 3, subtraction));

        //without using variable or helper method
        System.out.println(((Operation)(a, b) -> a + b).operation(5, 3));
    }


    private int operate (int a, int b, Operation op){
        return op.operation(a, b);
    }

}
interface Operation{
    int operation(int a, int b);
}
