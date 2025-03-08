package core_Java.c_6_StatementAndLoops.switchStatements;

import java.util.Scanner;

public class CalculatorBySwitch {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter num1: ");
        int num1=scanner.nextInt();
        System.out.println("Enter num2: ");
        int num2=scanner.nextInt();
        System.out.println("Enter operator (+,-,*,/,%) to perform mathematical operation");
        String operator=scanner.next();

        double result;
        switch (operator){
            case "+": result=num1+num2;
                System.out.println("Addition of two number: "+ result);
                break;
            case "-": result=num1-num2;
                System.out.println("Subtraction of two number: "+ result);
                break;
            case "*": result=num1*num2;
                System.out.println("Multiplication of two number: "+ result);
                break;
            case "/":
                //result= (double) num1 /num2;
                if (num2!=0){
                    result= (double) num1 /num2;
                    System.out.println("Division of two number: "+ result);
                }else {
                    System.out.println("Division by zero is not allowed!");
                }break;
            case "%": result=num1%num2;
                System.out.println("Modulus of two number: "+ result);
                break;

            default:
                System.out.println("Unable to perform anything for given data!");
        }
    }
}
