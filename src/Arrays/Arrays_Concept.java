package Arrays;

public class Arrays_Concept {
    public static void main(String[] args) {
        // array to store a roll number
        int a = 19;

        //store a persons name
        String name = "Modit Sanyasi";

        //Array to store 5 roll numbers
        int r1 = 10;
        int r2 = 45;
        //and so on, what if it was 500 roll number

        //we use array to solve this problem
        //Arrays are  homogenous collection of data types be it primitives or objects

        //syntax: datatype[] referenceVariable = new datatype[size];

        //Q : Store 5 roll numbers

        int[] rollNumbers = new int[5];
        /*here it means the referenceVariable rollNumbers is pointing towards an array object
        of type integer elements
        */


        //or directly
        int[] rollNumbers2 = {10,11,12,13,14};


        //breaking down each step of rollNumbers and rollNumbers2

        // declaration of array.
        int[] rollNums; // rollNums is getting defined in the stack memory, currently isn't pointing to any obj.
        //this thing happens at compile time, variable with data type is known by compiler

        //construction of array
        rollNums = new int[5]; //actually here only, object of arr is being created in heap memory
        //this memory allocation happens at run-time, hence known as dynamic memory allocation


        System.out.println(rollNums[1]); // prints 0, default value of int

        String[] arr = new String[5]; // referenceVariable in stack actual object in heap
        System.out.println(arr[0]); // prints null, null is a literal, and it is a special type, default value of String (an Object)

    }
}
