package task;

import java.util.Scanner;

public class Task3_Triangle {
    public static void main(String[] args) {
        //Program to find triangles Equilateral,Isosceles and Scalene

        // Logic building-Java

        // Step1
        // Inputs-3 sides-> datatype-float
        // Output-Triangle type->datatype-String

        //Step 2-Basic logic /Rough logic
        // if all sides are equal(s1==s2 and s2==s3 and s1==s3)-Equilateral triangle
        // ElseIf any two sides are equal (s1==s2 or s2==s3 or s1==s3)-Isosceles triangle
        // Else none of the sides are equal -Scalene triangle


        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value for side1: ");
        float s1 = scanner.nextFloat();
        System.out.print("Enter value for side2: ");
        float s2 = scanner.nextFloat();
        System.out.print("Enter value for side3: ");
        float s3 = scanner.nextFloat();

        if (s1 <= 0 || s2 <= 0 || s3 <= 0) {
            System.out.println("Please provide positive values for triangle sides");
        } else if (s1 + s2 > s3 && s2 + s3 > s1 && s1 + s3 > s2) {
            String triangle;
            if (s1 == s2 && s2 == s3) {
                triangle = "Equilateral";
            } else if (s1 == s2 || s2 == s3 || s3 == s1) {
                triangle = "Isosceles";
            } else {
                triangle = "Scalene";
            }
            System.out.println("The triangle is " + triangle + " triangle");
        } else {
            System.out.println("The given sides value do not form a triangle");
        }
    }
}

