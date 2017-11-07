package sprint_1.kib14;

//  Create a class that demonstrates the following: (all methods below can be in the same class)
//        1) A static method that calls another static method.
//        2) A static method that calls a non-static method.
//        3) A non-static method1 that calls another non-static method2, but this time method2 should return a value
//           to method1.
//        4) A non-static method1 that calls another non-static method2 and passes a value to method2.

public class Methods {
    public static void main(String[] args) {
        Methods nonstatic = new Methods();

        // Static method calling a non-static method
        nonstatic.NonstaticMethod();

        // Static method calling another static method
        Methods.StaticMethod();
    }

    public void NonstaticMethod () {
        // call another non-static method
        int x = firstNonStaticMethod();
        System.out.println(x);
    }

    public int firstNonStaticMethod () {
        System.out.println("This is a non-static method being called from the constructor.");
        secondNonStaticMethod("test string");
        return 2;
    }

    public void secondNonStaticMethod (String test) {
        System.out.println(test);
    }


    private static void StaticMethod() {
        System.out.println("...");
    }
}