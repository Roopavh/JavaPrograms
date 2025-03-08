package core_Java.c_4_Operators;

public class LogicalOperators {
    public static void main(String[] args) {
        /*
        Logical Operatores
        OR -> ||
        AND -> &&
        NOT -> !
        */

        int a= 10;
        int b= 20;

        boolean or_result= a<b || b<a;
        boolean and_result= a<b && b<a;
        boolean not_result= !(a<b || b<a);

        System.out.println(or_result);
        System.out.println(and_result);
        System.out.println(not_result);

    }
}
