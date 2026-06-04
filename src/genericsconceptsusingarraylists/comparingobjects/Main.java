package genericsconceptsusingarraylists.comparingobjects;
import java.util.*;
public class Main {
    public static void main(String[] args) {

        Student modit = new Student(32, 89.6f);
        Student arav = new Student(3, 99.56f);
        Student ram = new Student(13, 94.56f);
        Student shyam = new Student(22, 77.56f);
        Student hari = new Student(56, 79.6f);

        Student[] list = {modit, arav, ram, shyam, hari};

        System.out.println(Arrays.toString(list));

        /*
        this sorted our list based on marks as compareTo was
        used and override to check marks so it uses that overridden
        method to narrow down on what attribute should the objects be
        compared
         */
        Arrays.sort(list);
        /*
         can use anonymous class of Comparator<Student> with .sort and
         override compare, OR lambda expression as it is functional interface
         */

        System.out.println(Arrays.toString(list));

        /*
        if(modit > arav) sout("modit has more marks")
        Here since each obj has 2 attributes java raises an error
        as it doesn't know on what basis to compare both objects

        To solve this problem we need our student class to implement
        comparable interface

        */
//        if ((modit.compareTo(arav)) < 0) {
//            System.out.println(modit.compareTo(arav));
//            System.out.println("Arav has more marks then modit");
//        } else if ((modit.compareTo(arav) > 0)) {
//            System.out.println(modit.compareTo(arav));
//            System.out.println("Arav had less marks then Modit");
//        }else {
//            System.out.println("Both have equal marks");
//        }
  }
}

