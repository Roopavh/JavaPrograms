package core_Java.c_12_OOPSConcepts.Polymorphism.MethodOverRiding.Ex1;

public class MethodOverRiding {

   /*
    Method Overriding in Java allows a subclass (child class) to provide a specific implementation of a method that is already defined in its superclass (parent class).
    The method name, return type, and parameters must be the same as in the parent class.
    It enables runtime polymorphism (dynamic method dispatch).

    * Redefining a parent class method in a child class
    */

    public static void main(String[] args) {
        Hound hound=new Hound();
        hound.bark();
    }
}
