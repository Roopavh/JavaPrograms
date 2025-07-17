package core_Java.c_12_OOPSConcepts.Encapsulation.EncapsulationExamples.Ex1;

public class EncapsulationRunner{

    /*
    Encapsulation-
    ->Encapsulation is fundamental concept in object-oriented programming(OOP)
    ->Bundling of data attributes and methods that operates on data within single unit
    ->Data members should be private in nature and can be accessed them with help of methods only
    ->Methods with setters and getters only
   */

    public static void main(String[] args) {
        VWOLogin vwoLogin=new VWOLogin("Roopa","123");
        System.out.println(vwoLogin.password);
        vwoLogin.password="456";
        System.out.println(vwoLogin.password);

        GoodVWOLogin goodVWOLogin=new GoodVWOLogin("Roopa","123");
        // private data attributes cannot be accessed outside class, can be accessed only with help of methods(getters and setters)
        // System.out.println(goodVWOLogin.username);
       // System.out.println(goodVWOLogin.password);

        System.out.println(goodVWOLogin.getUsername());
        System.out.println(goodVWOLogin.getPassword());

        goodVWOLogin.setUsername("Vinmayi");
        System.out.println(goodVWOLogin.getUsername());

        goodVWOLogin.setPassword("456",false);
        System.out.println(goodVWOLogin.getPassword());

        goodVWOLogin.setPassword("456",true);
        System.out.println(goodVWOLogin.getPassword());


    }
}

class VWOLogin{

    public String username;
    public String password;

    VWOLogin(String usr, String pwd){
        this.username=usr;
        this.password=pwd;
    }
}

class GoodVWOLogin{
    // private data members cannot be accessed outside the class
    private String username;
    private String password;

    GoodVWOLogin(String username, String password){
        this.username=username;
        this.password=password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
        System.out.println("Username updated successfully");
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password, boolean isAdmin) {
        if (isAdmin) {
            this.password = password;
            System.out.println("Password changed successfully");
        }else {
            System.out.println("Not allowed to change password!");
        }
    }
}