package core_Java.c_4_Operators;

public class IncrementAndDecrementOperator {
    public static void main(String[] args) {

        // ++a ->pre increment -> First increment the value and then prints
        // a++ ->post increment -> First prints the value and then increments

        int a=10;
        System.out.println(++a + a++ + ++a);


        //  expression value  | a value
        //        11          |    11
        //        11          |    12
        //        13          |    13

        int b=10;
        System.out.println(--b + b-- + --b);
        System.out.println(b);

        //  expression value  | b value
        //        9           |    9
        //        9           |    8
        //        7          |     7
    }
}

