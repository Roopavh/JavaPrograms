package feb.printMethods;

public class PrintlnAndPrintf {
    public static void main(String[] args) {

/*
        Printing tables using printf() method

     printf()- formatting different datatype values
        %f -> floating, double
        %d -> int, byte, long, short
        %s -> String
        %b -> boolean
        %x -> Hex
*/

        int table = 12;
        String name= "Roopa";

        System.out.printf("%s is writing tables of %d", name , table);System.out.println();
        System.out.printf("%d * %d = %d",table,1,table);System.out.println();
        System.out.printf("%d * %d = %d",table,2,table*2);System.out.println();
        System.out.printf("%d * %d = %d",table,3,table*3);System.out.println();
        System.out.printf("%d * %d = %d",table,4,table*4);System.out.println();
        System.out.printf("%d * %d = %d",table,5,table*5);System.out.println();
        System.out.printf("%d * %d = %d",table,6,table*6);System.out.println();
        System.out.printf("%d * %d = %d",table,7,table*7);System.out.println();
        System.out.printf("%d * %d = %d",table,8,table*8);System.out.println();
        System.out.printf("%d * %d = %d",table,9,table*9);System.out.println();
        System.out.printf("%d * %d = %d",table,10,table*10);System.out.println();

    }
}
