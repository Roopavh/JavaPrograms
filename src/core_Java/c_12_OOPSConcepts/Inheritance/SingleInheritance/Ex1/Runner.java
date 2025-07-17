package core_Java.c_12_OOPSConcepts.Inheritance.SingleInheritance.Ex1;

public class Runner {
    public static void main(String[] args) {
         // Inheritance can be achieved by keyword "extends"
        // Single Inheritance-One child/sub extends one father/super class
       // child/son class will get the properties of father/super class

        Son son=new Son();
        System.out.println(son.gold_f);
        son.father_home();
        System.out.println(son.gold_s);
        son.son_home();

        Father father=new Father();
        System.out.println(father.gold_f);
        father.father_home();
    }

}
