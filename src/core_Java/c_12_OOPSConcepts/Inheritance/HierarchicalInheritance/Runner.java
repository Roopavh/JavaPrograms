package core_Java.c_12_OOPSConcepts.Inheritance.HierarchicalInheritance;

public class Runner {
    public static void main(String[] args) {

        //All son classes accessing Father class properties
        Son1 son1=new Son1();
        son1.son1();
        son1.home();

        Son2 son2=new Son2();
        son2.son2();
        son2.home();

        Son3 son3=new Son3();
        son3.son3();
        son3.home();

        Father father=new Father();
        father.home();
    }
}
