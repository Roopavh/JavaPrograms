package core_Java.c_12_OOPSConcepts.Polymorphism.MethodOverRiding.Ex2;

public class MethodOverRidingEx2 {
    public static void main(String[] args) {
        ChromeTC chromeTC=new ChromeTC();
        chromeTC.openBrowser();

        FirefoxTC firefoxTC=new FirefoxTC();
        firefoxTC.openBrowser();

        CommonBaseToAll commonBaseToAll=new CommonBaseToAll();
        commonBaseToAll.openBrowser();

        //Dynamic dispatch->superclass reference points to a subclass object
        CommonBaseToAll baseToAll;

        baseToAll=new ChromeTC();
        baseToAll.openBrowser();

        baseToAll=new FirefoxTC();
        baseToAll.openBrowser();

       // FirefoxTC ff=new ChromeTC(); there is no relationship hence this reference is not possible





    }
}
