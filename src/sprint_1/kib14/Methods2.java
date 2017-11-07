package sprint_1.kib14;

//  Creating ANOTHER class that demonstrates methods used in the same class.

public class Methods2 {
    public static void main(String[] args) {

//      A static method that calls another static method.
        Methods2.Object();

//      A static method that calls a non-static method.
        Methods2 something = new Methods2();
        something.Method1();
        }

    public static void Object() {
        System.out.println("Static calling static");
    }

//    public void Method1() {
//        System.out.println("Static calling non-static");


//      A non-static method1 that calls another non-static method2, but this time method2 should return a value to method1.
    public void Method1() {
        int i = Method2();
        System.out.println(i);
    }

//      A non-static method1 that calls another non-static method2 and passes a value to method2.
    public int Method2() {
        System.out.println("Static calling non-static");
        Method3("test string");
        return 10;
    }

    public void Method3(String test) {
        System.out.println("sample value");
    }
}