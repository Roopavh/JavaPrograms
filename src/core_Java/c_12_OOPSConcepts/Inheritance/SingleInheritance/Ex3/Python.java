package core_Java.c_12_OOPSConcepts.Inheritance.SingleInheritance.Ex3;

public class Python extends Programming {
    //extend-is a relation
    //Python is a programming

    void print() {
        System.out.println(author);
        System.out.println(version);
    }


    public static void main(String[] args) {
        Python python = new Python();
        python.print();
    }
}
