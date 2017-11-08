package sprint_1.kib15;

//  Create at least three example classes (class1, class2, class3) that demonstrate comfort in creating multiple classes
//  with multiple methods, and then call between those methods across classes.
//  Class1 should have the main method. The main method then needs to create an object of class1, class2, class3. It
//  should then use the the class1 object to call one or more non-static methods in class2 and class3.

public class Class1 {

    public static void main(String[] args) {
        String firstname;
        String lastname;
        
        Class1 object1 = new Class1();
        object1.newMethod();

        Class2 object2 = new Class2();
        object2.setFirstname("Andrea");
        object2.setLastname("Kibler");
        object2.anotherMethod();

        Class3 object3 = new Class3();
        object3.setFirstname("Gioh");
        object3.setLastname("Hrndz");
        object3.oneMoreMethod();
    }

    private void newMethod() {
        System.out.println("Here we are!");
    }
}