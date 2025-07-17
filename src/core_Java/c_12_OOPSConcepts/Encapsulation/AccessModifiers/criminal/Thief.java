package core_Java.c_12_OOPSConcepts.Encapsulation.AccessModifiers.criminal;

import core_Java.c_12_OOPSConcepts.Encapsulation.AccessModifiers.police.Cop;

public class Thief {
    public static void main(String[] args) {
        Cop thief=new Cop(100);
          // Protected method can't be accessed in the other folder/package
         //  thief.canIShoot();
        //  System.out.println(thief.gun);
    }
}
