package core_Java.c_12_OOPSConcepts.Inheritance.MultipleInheritance;

public class Son //extends Father,Mother
{
    // Multiple Inheritance is not possible in java
    // Java prevents multiple inheritance with classes to avoid ambiguity and complexity,
    // but allows it with interfaces for flexibility
    // Diamond problem

    void canIuse() {
   //     money(); //JVM will be confused to which class method to use hence multiple inheritance is not possible
    }

}
