package Generics_Concepts_Using_ArrayLists;

import java.util.Arrays;
import java.util.List;

/*
    Here we restrict T using wildcards
 */
public class Custom_GenericWithWildcard_Arraylist<T extends Number> {

    //applying encapsulation for non-direct accessing
    private Object[] data;
    //making default size of every arraylist same -> non-dependent on object
    private static final int DEFAULT_SIZE = 10;
    //size will be tracking how many data inserted
    private int size = 0;// working as index value

    public Custom_GenericWithWildcard_Arraylist() {
        /*
        when private T[] data then -> this.data = new T[DEFAULT_SIZE] is error due to type erasure
        At compile time, Java erases all generic type information. So at runtime, T doesn't exist —
        the JVM has no idea what T is. Since it doesn't know what T is, it can't allocate memory for a new T[] array
        because it doesn't know the size or type to allocate.
        So new T[DEFAULT_SIZE] is illegal.
         */
        //so now we use Object type in line 8 to define the data arraylist:
        this.data = new Object[DEFAULT_SIZE];
    }
    /*
    Here we can only pass Number type and not its subclasses
     */
    public void getList(List<Number> list, int num){//declaring int num just for the sake of no overloading error
        //doing something
    }
    /*
    here this given wildcard is used to pass a number as well as its subclasses
    as ? here is actually the type that's passed and anything that extends
    number here can be passed to it
     */
    public void getList(List<? extends Number> list){

    }

    public void add(T value) {
        if (isFull()) {
            resize();
        }
        //initially size 0, -> 0++ then 1 and so on.
        data[size++] = value;
    }

    private void resize() {
        //temporary array for resizing
        Object[] temp = new Object[data.length * 2];

        //copy the current items in temporary array
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        // set the actual array as the temp array which has just copied the original array but with twice the size available
        data = temp;// data now points to temp array
    }

    public T remove() {

        T removed = (T)(data[--size]);
        //returning the vale that is being removed -> like pop() in stack
        return removed;
    }

    private boolean isFull() {
        // checking if size has increased upto the length of data;
        return size == data.length;
    }

    public T get(int index) {
        return (T)data[index];
    }

    public int getSize() {
        return this.size;
    }

    public void set(int index, T value) {
        data[index] = value;
    }

    @Override
    public String toString() {
        return "Custom_ArrayList{" +
                " data = " + Arrays.toString(data) +
                ", size = " + size +
                '}';
    }

    public static void main(String[] args) {
//        //***ArrayList provided by JAVA****
//        //raw arraylist
//        ArrayList list = new ArrayList();
//        //in-built methods of arraylist provided by java
//        list.add(45);
//        list.remove(0);
//        list.get(0);
//        list.set(1, 6789);
//        list.isEmpty();

        //***Custom Generic ArrayList
        Custom_GenericWithWildcard_Arraylist<Integer> list = new Custom_GenericWithWildcard_Arraylist<>();
        //called constructor hence now its default size is 10 initially

        //operations on custom arraylist using, our created method
        list.add(3);
        list.add(5);
        list.add(9);
        for (int i = 0; i < 15; i++) {
            list.add(2 * i);
        }
        System.out.println(list);

        /*
         here error as String is not a Number, thus using Wildcards with generics we restrict the type of arrayList
         */
        //Custom_GenericWithWildcard_Arraylist<String> list2 = new Custom_GenericWithWildcard_Arraylist<>();




    }
}
