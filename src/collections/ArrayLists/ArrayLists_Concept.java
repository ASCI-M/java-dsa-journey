package collections.ArrayLists;
import java.sql.SQLOutput;
import java.util.*;

public class ArrayLists_Concept {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        //used when we don't know the size of array
        //Is a dynamic array

//        //Syntax
        ArrayList<Integer> list = new ArrayList<>();

//        list.add(10);
//        list.add(20);
//        list.add(30);
//
//        // .set(index, updating value)
//        list.set(0, 99);
//
//        //.contains(elements) -> returns boolean value
//        System.out.println(list.contains(20));

        //empty arraylist
        System.out.println(list);

        //input
        for(int i = 0; i < 5; i++){
            list.add(in.nextInt());
        }

        //output : O(1) time complexity
        for (int i = 0; i < 5; i++) {
            System.out.print(list.get(i) + " "); // pass argument as index
        }
     }
}
