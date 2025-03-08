package core_Java.c_4_Operators;

public class RelationalOperators {
    public static void main(String[] args) {

        //Relational operators ->   <  >  <=  >=  ==  !=    used to compare two values - Always return true/false

        int a=10;
        int b=20;

        boolean result=a<b;
        System.out.println(result);

        String  first_name="Roopa";
        String last_name="VH";

        boolean name = first_name == last_name;
        System.out.printf("First Name and last names are same ? %b" , name);


    }
}
