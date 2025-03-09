package task;

import java.util.Scanner;

public class Task7_CalculatorUsingFunction {

    public static void main(String[] args){

        // Create function of add,sub,mul,mod and div
        //with parameters/arguments-take inputs from user

        //Step1
        //Input-data type -user inputs-Scanner
        //Output-data type-result

        //Step2-Rough logic
        //create function -Type4(with parameters and return type)

        //Step3
        //write the code
        //Find and fix the edge cases

        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter num1: ");
        int num1=scanner.nextInt();
        System.out.print("Enter num2: ");
        int num2=scanner.nextInt();

        int result_add=addition_of_two_num(num1,num2);
        System.out.println("Addition: "+ result_add);

        int result_sub=subtraction_of_two_num(num1,num2);
        System.out.println("Subtraction: "+ result_sub);

        int result_mul=multiplication_of_two_num(num1,num2);
        System.out.println("Multiplication: "+ result_mul);

        int result_mod=modulus_of_two_num(num1,num2);
        System.out.println("Modulus: "+ result_mod);

        int result_div=division_of_two_num(num1,num2);
        System.out.println("Division: "+ result_div);

        scanner.close();
    }
    static int addition_of_two_num(int num1,int num2){
        return num1+num2;
    }

    static int subtraction_of_two_num(int num1,int num2){
        return num1-num2;
    }

    static int multiplication_of_two_num(int num1,int num2){
        return num1*num2;
    }

    static int modulus_of_two_num(int num1,int num2){
        return num1%num2;
    }

    static int division_of_two_num(int num1,int num2){
        if(num2==0){
            System.out.println("Division by zero is not allowed");
        }
        return num1/num2;
    }
}
