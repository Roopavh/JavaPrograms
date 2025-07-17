package core_Java.c_12_OOPSConcepts.Encapsulation.AccessModifiers.police;

public class Cop {
    private int gun;
    private String iCard;

    public Cop(int bullet){
        this.gun=bullet;
    }

    //protected data members/methods ll be accessible in the package/folder
    protected void canIShoot(){
        System.out.println("Yes, you can shoot!");
    }
}
