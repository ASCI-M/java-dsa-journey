package enums;

public class Basic {
    /*
        enums : fixed group of objects

        cannot extend any other class as multiple inheritance is prohibited in class and by default enum extends java.lang.enum
        interfaces are allowed
    */
    enum Week {
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;

        /*
         these are enum constants

         every single one is public, static and final

         type of these constants are Week
         */

        Week(){
            System.out.println("Constructor called for " + this);
        }
        /*
         constructor is not public, protected, default -> only private
         because we don't wanna create its object as they are constants

         Here, below initializing firstDay triggers the constructor for all the given constants
         */

        // internally : public static final Week Monday = new Week();
    }

    public static void main(String[] args) {
        //accessing one of the constants
        Week firstDay = Week.Monday;

        for (Week day : Week.values()){ // .values returns Week[]
            //accessing all constants
            System.out.println(day);
        }

        // ordinal returns the position of declaration in enum, here 0th position for Week.Monday
        System.out.println(firstDay.ordinal());

        //returns enum constant
        System.out.println(Week.valueOf("Tuesday"));
    }
}
