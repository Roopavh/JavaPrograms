package task;

import java.util.Scanner;

public class Task4_ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to reverse: ");
        int num = scanner.nextInt();

        int reverse = 0;
        for (int i = num; num != 0; num /=10) {
            int remainder = num % 10;// to get last digit
            reverse = reverse * 10 + remainder;// shifts the digits and add remainder

        }
        System.out.println("The reversed number is: "+reverse);

        scanner.close();
    }
}
