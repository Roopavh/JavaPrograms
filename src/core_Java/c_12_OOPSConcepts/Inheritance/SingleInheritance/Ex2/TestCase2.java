package core_Java.c_12_OOPSConcepts.Inheritance.SingleInheritance.Ex2;

public class TestCase2 extends CommonBaseTest {

    TestCase2() {
        System.out.println("Default Constructor-Child");
    }

    void testcase2() {
        startBrowser();
        System.out.println("Testcase2 executing");
        readExcelFile();
        closeBrowser();
    }
}
