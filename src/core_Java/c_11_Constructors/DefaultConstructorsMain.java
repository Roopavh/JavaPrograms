package core_Java.c_11_Constructors;

public class DefaultConstructorsMain {
    public static void main(String[] args) {

        /*
        Constructors:
        * Constructors are special methods in java
        * Used for initialization during object creation
        * They have the **same name as the class** and **do not have a return type**(Even "void" also)

        There are two types of Constructors
        * Default constructor
        * Parameterized constructor

        */

        //Invoking default Constructor by creating object of Car class

        Car car1=new Car();
        System.out.println(car1.name);
        System.out.println(car1.year);

    }
}
