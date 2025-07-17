package core_Java.c_12_OOPSConcepts.Inheritance.SingleInheritance.Ex1;

public class Son extends Father {

    int gold_s= 2000;

    void son_home(){
        System.out.println("Son home 3BHK");
        System.out.println(gold_f);//Attribute of father class
        father_home();//Method /Behaviour of father class
    }
}
