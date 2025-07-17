package core_Java.c_12_OOPSConcepts.Inheritance.SingleInheritance.Ex2;

public class TestCase1 extends CommonBaseTest{
    //Child default constructor
    TestCase1(){
        System.out.println("Default Constructor-Child");
    }
    void testcase1(){
        //these are behaviours from parent class
        startBrowser();
        readExcelFile();
        closeBrowser();
    }
}
