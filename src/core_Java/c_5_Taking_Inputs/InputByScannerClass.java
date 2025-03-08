package core_Java.c_5_Taking_Inputs;

import java.util.Scanner;

public class InputByScannerClass {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter your name ");
        String name=scanner.nextLine();

        System.out.println("Enter your age ");
        int age=scanner.nextInt();

        System.out.println("Enter your salary ");
        int salary=scanner.nextInt();

        System.out.println("Your name is :" +name);
        System.out.println("Your age is :" +age);
        System.out.println("Your salary is :" +salary);

        scanner.close();
    }
}
