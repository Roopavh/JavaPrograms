package core_Java.c_8_StringClass;

public class Ex1_StringUses {
    public static void main(String[] args) {
        /*
         * String->String is a set of characters or sequence of characters
         * String is non-primitive data type, and it is built in class
         * String class in present in "java.lang" package
         * String is final class(features of String class cant be inherited)
         * String are immutable in nature(Cant be changed)-When you create a string,It ll be always present in memory (String Constant Pool(SCP) or Heap Area)
         * Strings are constant; their values cannot be changed after they are created.

         * How String are stored in JVM?
            1. String constant pool
            2. Heap Area(Object)


         */
        char ch='a'; //Char is only single character enclosed by single quotes

        String string="Vinmayi"; // set of characters or sequence of characters, enclosed by double quotes

        //To find length of string
        int string_length=string.length();
        System.out.println("Length of string is: "+string_length);

    }
}
