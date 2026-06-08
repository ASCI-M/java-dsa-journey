package collections.arraylists;

import java.util.Arrays;

public class ImplementingOwnArrayList {

    //applying encapsulation for non-direct accessing
    private int[] data;
    //making default size of every arraylist same -> non-dependent on object
    private static final int DEFAULT_SIZE = 10;
    //size will be tracking how many data inserted
    private int size = 0;// working as index value

    public ImplementingOwnArrayList() {
        this.data = new int[DEFAULT_SIZE];
    }

    public void add(int number) {
        if (isFull()) {
            resize();
        }
        //initially size 0, -> 0++ then 1 and so on.
        data[size++] = number;
    }

    private void resize() {
        //temporary array for resizing
        int[] temp = new int[data.length * 2];

        //copy the current items in temporary array
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        // set the actual array as the temp array which has just copied the original array but with twice the size available
        data = temp;// data now points to temp array
    }

    public int remove(){
        /*
         not actually removing the data, but changing the size value by -1 -> now upon adding new data after remove
         the new data will overwrite this data. -> if size was 5 with element 10 --size, size value is now 4 and on
         calling .add() method now at 5th position the new data is inserted hence overwriting 10
         */
        int removed = data[--size];
        //returning the vale that is being removed -> like pop() in stack
        return removed;
    }

    private boolean isFull() {
        // checking if size has increased upto the length of data;
        return size == data.length;
    }

    public int get(int index) {
        return data[index];
    }

    public int getSize() {
        return this.size;
    }

    public void set(int index, int value) {
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

        //***Custom ArrayList
        ImplementingOwnArrayList list = new ImplementingOwnArrayList();//called constructor hence now its default size is 10 initially

        //operations on custom arraylist using, our created method
        list.add(3);
        list.add(5);
        list.add(9);
        for (int i = 0; i < 15; i++) {
            list.add(2 * i);
        }
        System.out.println(list);

        /*
        Here the problem with  this custom arraylist is, it's storing data of only int data type as in[] data is hard coded
        during the declaration of array

        Thus, generics are now used to solve this problem

        Generics -> A parameterized type
         */


    }
}
