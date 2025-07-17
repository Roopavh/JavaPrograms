package core_Java.c_12_OOPSConcepts.Polymorphism.MethodOverRiding.Ex1;

public class Hound extends Dog {
    //Hound is a type of dog

    @Override
    void bark(){
        System.out.println("Hound barking ");
    }
}
