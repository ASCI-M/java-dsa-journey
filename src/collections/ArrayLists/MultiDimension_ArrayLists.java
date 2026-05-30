package collections.ArrayLists;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiDimension_ArrayLists {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //ArrayList of ArrayList
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();//creates one single outer arraylist the main container

        // initializing the 2d arraylists
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());//initialized each inner arraylist
        }
        /*if not initialized and throws indexOutOfBound Exception as no inner list doesn't exist hence no length
         of outer list and .get(0) initially doesnt work*/

        //input
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(in.nextInt());//getting each element of arraylist and adding value entered
            }
        }

        //output
        System.out.println(list);


    }
}
