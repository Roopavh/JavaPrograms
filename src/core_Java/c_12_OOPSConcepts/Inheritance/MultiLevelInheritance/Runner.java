package core_Java.c_12_OOPSConcepts.Inheritance.MultiLevelInheritance;

public class Runner {
    public static void main(String[] args) {

        //Father and grandfather and son class properties are accessible for Son class object
        Son son=new Son();
        son.grandFather_home();
        son.father_home();
        son.son_home();
        son.extra();
        son.gold();//using gold function of son class

        //Son class properties not accessible father object
        Father father=new Father();
        father.extra();
        father.father_home();
        father.gold();
        father.grandFather_home();

        //Father and Son class properties not accessible for grandfather object
        GrandFather grandFather=new GrandFather();
        grandFather.grandFather_home();
        grandFather.gold();

    }
}
