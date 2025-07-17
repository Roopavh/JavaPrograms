package core_Java.c_9_Arrays;

import java.util.Scanner;

public class ArraysUserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Defining the size of the array
        System.out.println("Enter the size of the array you want to create");
        int size = scanner.nextInt();

        //Creating array to store the given user inputs
        int[] numbers = new int[size];

        //Taking user the inputs one by one till given size
        for (int i = 0; i < size; i++) {
            System.out.println("Enter the number " + (i + 1));
            numbers[i] = scanner.nextInt();
        }
        //Printing the numbers
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }


         //String input example
        System.out.println("Enter the size of the array you want to create");
        int size1=scanner.nextInt();

        String[] names=new String[size1];

        for (int i = 0; i < size1; i++) {
            System.out.println("Enter the name "+(i+1));
            names[i]=scanner.next();
        }

        //Printing the names
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
