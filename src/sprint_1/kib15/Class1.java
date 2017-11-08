package sprint_1.kib15;

//  Create at least three example classes (class1, class2, class3) that demonstrate comfort in creating multiple classes
//  with multiple methods, and then call between those methods across classes.
//  Class1 should have the main method. The main method then needs to create an object of class1, class2, class3. It
//  should then use the the class1 object to call one or more non-static methods in class2 and class3.

public class Class1 {

    public static void main(String[] args) {
        int i = 0;
        int a = 10;

        Class1 object1 = new Class1();
        object1.newMethod();

//        Class1 object2 = new Class1();
//        object2.anotherMethod();
//        object2.i = 0;
//
//        Class1 object3 = new Class1();
//        object3.oneMoreMethod();
//        object3.a = 10;

    }

    private void newMethod() {
        System.out.println("Here is a new method.");
    }
}

