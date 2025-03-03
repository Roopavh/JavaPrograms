package feb.statementAndLoops.ifElseStatements;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        // Enter number to find even or odd

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number,I will tell you Even or Odd");
        int num = scanner.nextInt();

        if (num % 2 == 0) {
            System.out.println("Number is Even");
        } else {
            System.out.println("Number is Odd");
        }
        scanner.close();
    }

}