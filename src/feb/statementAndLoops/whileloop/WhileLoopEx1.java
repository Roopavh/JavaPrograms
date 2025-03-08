package feb.statementAndLoops.whileloop;

import java.util.Scanner;

public class WhileLoopEx1 {
    public static void main(String[] args) {

        //for and while loops are also called as "Entry Controlled Loop"
        //Take user input for age and print the age in reverse order

        //USing scanner class
        /*Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age = scanner.nextInt();

        System.out.println("Your ages are in reverse order");
        while (age > 0) {
            System.out.print(","+age);
            age--;
        }*/

        //Using arguments
        String arg_String=args[0];
        int age= Integer.parseInt(arg_String);

        System.out.println("Printing your ages in reverse order");

        while (age>0){
            System.out.printf(", %d", age);
            age--;
        }
    }
}