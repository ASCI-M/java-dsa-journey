package Generics_Concepts_Using_ArrayLists.Comparing_Objects;
/*
Here interface uses generics too, we passed Student type on which
this class objects should be comparable
 */
public class Student implements Comparable<Student> {
    int rollNo;
    float marks;

    public Student(int rollNo, float marks) {
        this.rollNo = rollNo;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return marks + " " + rollNo ;
    }

    /*
        Overriding the abstract class of comparable with parameter of
        comparable type
         */
    @Override
    public int compareTo(Student o) {
        int diff = (int)(this.marks - o.marks);

        //if diff == 0; means both are equal
        //if diff < 0; means o is bigger
        //else o is smaller

        return diff;
    }
}
