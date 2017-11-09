package sprint_1.kib21;

//  Demonstrate a throw.
//        -Create one class with two methods including the main method.
//        -The main method should call the second method.
//        -In the second method throw an exception.
//        -The main method should either handle this exception or throw it to the JVM.
//        -Make sure you understand the results of both.

public class ThrowException {
    public static void main(String[] args) {
        try{
            int i = someMethod();
        } catch (ArithmeticException ae) {
                throw ae;
            }
            System.out.println("After try/catch");
            }

    public static int someMethod() throws ArithmeticException {
        throw new ArithmeticException();
    }
}


