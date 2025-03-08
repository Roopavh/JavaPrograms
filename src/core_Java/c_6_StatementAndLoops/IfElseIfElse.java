package core_Java.c_6_StatementAndLoops;

import java.util.Scanner;

public class IfElseIfElse {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter Number1: ");
        int num1=scanner.nextInt();

        System.out.println("Enter Number2: ");
        int num2=scanner.nextInt();

        if (num1>num2){
            System.out.println("Num1 > Num2");
        } else if (num2>num1) {
            System.out.println("Num2 > Num1");
        }else {
            System.out.println("Numbers are equal");
        }
        scanner.close();
    }
}
