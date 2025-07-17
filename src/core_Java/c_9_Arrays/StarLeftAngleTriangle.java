package core_Java.c_9_Arrays;

import javax.xml.transform.Source;
import java.util.Scanner;

public class StarLeftAngleTriangle {
    public static void main(String[] args) {
        /*
         *
         **
         ***
         ****
         *****

         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number 5 to print * pattern left angle triangle");
        int num = scanner.nextInt();

        for (int i = 0; i < num; i++) {
            for (int j = num - i; j > 0; j--) {
                System.out.print(" ");// print the spaces for left align
            }

            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
