package exceptionhandling;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        /*
        Write code which can raise an exception
         */
        try {
//            divide(a, b);
            String name = "Modit";
            if(name.equals("Modit")){
                /*
                Throwing my own made exception
                 */
                throw new MyException("Name is of creator");
            }
        }
        catch (MyException e){
            System.out.println(e.getMessage());
        }
        /*
        Catch catches the exception of type of object passed as parameter, here object type is Arithmetic Exception
         */
        catch (ArithmeticException ea) {
            System.out.println(ea.getMessage());
        }
        /*
        Child must be above to narrow down what exception occurred or else the parent block above
        will always execute due to IS-A relationship
         */
        catch (Exception e) {
            System.out.println("An exception occurred");
        }
        /*
        Only 1 finally block allowed
         */
        finally {
            System.out.println("This block will always execute");
        }
    }
    /*
    Throws indicates that the given method may throw an exception and the responsibility to catch that is with
    the caller
     */
    static int divide(int a, int b) throws ArithmeticException{
        if(b == 0){
            /*
            Actually throwing an exception with a message to be displayed.
             */
            throw new ArithmeticException("can't divide a number by 0");
        }
        return a / b;
    }

}
