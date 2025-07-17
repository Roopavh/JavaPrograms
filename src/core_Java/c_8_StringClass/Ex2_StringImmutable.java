package core_Java.c_8_StringClass;

public class Ex2_StringImmutable {
    public static void main(String[] args)
    {
        //String are immutable in nature

        //only one memory will be created in SCP bcz all values are same(If values are different for each different memory ll be created)
        String s1="Vinmayi";
        String s2="Vinmayi";
        String s10="Vinmayi";

        String s4=s1.toUpperCase();//One more memory ll be created bcz the value converted to UPPER case
        System.out.println(s1 +" "+s2+" "+s10);
        System.out.println("Converted value: "+s4);

    }
}
