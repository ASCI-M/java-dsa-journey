package cloning;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human modit = new Human(18, "Modit Sanyasi");
        /*
        Processing time is significantly more as extra new keyword
        is used to allocate memory.

        Done using constructor overloading
         */
//        Human twin = new Human(modit);

        /*
        using in-built method for cloning

        twin has now exactly copied the modit object,
        faster than above method
         */
        Human twin = (Human)modit.clone();

        /*
        Primitives are cloned, made new attributes and copied, but
        not with non-primitives

        Non-primitive twin.name (String) is also pointing to modit.name
         */
        System.out.println(twin.age + " " +twin.name);
        System.out.println(Arrays.toString(twin.arr));

        /*
        During shallow copy
        Here the new array object (a non-primitive) isn't created
        but twin.arr points to modit.arr itself

        Thus, any change in twin will result in modit and vice versa

         In deep copy

         In the clone() method we manually made a new array thus any change in
         this copied twins array will not affect the original array of modit
         */
        twin.arr[0] = 100;

        /*
        Initially in shallow copy,
        Change via twin.arr reflected in modit.arr

        In deep copy, no change in modits arr
         */
        System.out.println(Arrays.toString(modit.arr));
        /*
        In deep twin change but not modit
         */
        System.out.println(Arrays.toString(twin.arr));
    }
}
