package feb.operators;

public class OperatorOverloading {
    public static void main(String[] args) {
        //Operator overloading-> + operator behaves differently based on different data types
        // with numeric datatypes operates as arithmetic operator
        // with String data type behaves as concatenation

        String name="Roopa";
        int age= 65;

        System.out.println("Age of " +name+ " after 10 year is " +age+ 10);//concatenation

        System.out.println("Age of " +name+ " after 10 year is " +(age+10)); //concatenation+mathematical operation


    }
}
