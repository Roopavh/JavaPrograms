package core_Java.c_8_StringClass;

public class Ex3_StringEquals {
    public static void main(String[] args) {
        //String are immutable in nature

        //String created with assignment operator always creates memory in "string constant pool"
        //only one memory will be created in SCP bcz all values are same(If values are different for each different memory ll be created)
        String s1 = "Vinmayi"; // SCP same
        String s2 = "Vinmayi"; // SCP same
        String s10 = "Vinmayi"; // SCP same
        String s11 = "vinmayi"; // SCP // different reference bcz value is different

        //String created with "new" keyword always creates new memory location in heap Area
        String s3 = new String("Vinmayi"); // HA
        String s4 = new String("Vinmayi"); // HA
        String s5 = new String("vinmayi"); // HA

        // == comparison operator actually compare the references
        // equals() method->Compare the contents(values)

        System.out.println(s1 == s2); // true both present in SCP and pointing same reference
        System.out.println(s1 == s10); // true both present in SCP and pointing same reference
        System.out.println(s11 == s10);// false bcz reference are different even though present in same SCP
        System.out.println(s1 == s3); //  false bcz references are different even though values are same(one SCP and other in HA)
        System.out.println(s3 == s4); //  false bcz references are different even though values are same(Even though both present in HA)

        System.out.println(s1.equals(s2));//true both values are same
        System.out.println(s1.equals(s11));//false both values are different
        System.out.println(s1.equals(s3));//true both values are same
        System.out.println(s3.equals(s5));//false both values are different

        System.out.println(s1.replace('V','R'));
        System.out.println(s1.toUpperCase());
        System.out.println(s1);
        System.out.println(s1.toString());
    }
}
