package core_Java.c_12_OOPSConcepts.Polymorphism.MethodOverRiding.Ex2;

public class ChromeTC extends CommonBaseToAll {

    @Override
    void openBrowser(){
        System.out.println("Chrome will open!");
    }
}

class FirefoxTC extends CommonBaseToAll{

    @Override
    void openBrowser(){
        System.out.println("Firefox will open now!");
    }
}