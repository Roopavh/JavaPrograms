package core_Java.c_9_Arrays;

import java.util.Scanner;

public class Array_StarRightAngleTriangle {
    public static void main(String[] args) {
      /*
      Star pattern right angle triangle
        *
        **
        ***
        ****
        *****

        */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number 5 to  print * pattern right angle triangle");
        int num=scanner.nextInt();

        for (int i = 0; i < num; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*" +" ");
            }
            System.out.println(" ");
        }
/*
        *****
        ****
        ***
        **
        *
              */
        System.out.println("Enter the number 5 to  print * pattern right angle triangle");
        int num1 = scanner.nextInt();

        for (int i = num1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println(" ");
        }
    }
}
