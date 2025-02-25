package feb.operators;

public class ArithmeticOperators {
    public static void main(String[] args) {

        // Arithmetic operators ->   + - / * %  used for basic mathematical operations

        int a=10;
        float b= 12;
        float add_result= a+b;
        double sub_result= a-b;
        double mul_result= a*b;
        double div_result= a/b;
        double mod_result= a%b;

/*
     printf()- accepting different datatype values
        %f -> floating, double
        %d -> int, byte, long, short
        %s -> String
        %b -> boolean
        %x - Hex
*/

        System.out.printf("Addition Result is %f",add_result);
        System.out.println();
        System.out.printf("Subtraction Result is %f",sub_result);
        System.out.println();
        System.out.printf("Multiplication Result is %f",mul_result);
        System.out.println();
        System.out.printf("Division Result is %f",div_result);
        System.out.println();
        System.out.printf("Modulus Result is %f",mod_result);


    }
}
