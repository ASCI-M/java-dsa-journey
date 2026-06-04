package cloning;
/*
without implementing this interface clone() throws a
CloneNotSupportedException
 */
public class Human implements Cloneable {
    int age;
    String name;
    int[] arr;

    /*
   Constructor overloading for cloning
 */
//    public Human(Human other) {
//        this.age = other.age;
//        this.name = other.name;
//    }

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
        this.arr = new int[]{3, 4, 5, 6, 9, 1};
    }



    /*
    The clone() method itself throws the CloneNotSupportedException
    so we need to throw it or handle it here.

    Object.clone(), class using this must implement Cloneable interface
     */
    @Override
    public Object clone() throws CloneNotSupportedException{
//        /*
//        This is shallow copy
//
//        after cloning and performing any change in non-primitive value
//         of cloned object the non-primitives value of
//         actual object will change too
//
//         Only primitives will actually be copied, copied non-primitives
//          will point to same object as the actual non-primitive
//         */
//       return super.clone();

        //Doing deep copy
        Human twin = (Human)super.clone();//this is a shallow copy

        //making a deep copy

        /*
        Manually making the arr reference variable of twin to
        point to other array rather than modits array
         */
        twin.arr = new int[twin.arr.length];
        for (int i = 0; i < twin.arr.length; i++) {
            //coping every element of original objects array
            twin.arr[i] = this.arr[i];
        }
        return twin;

   }


}
