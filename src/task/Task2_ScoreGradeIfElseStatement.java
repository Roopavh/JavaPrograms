package task;

import java.util.Scanner;

public class Task2_ScoreGradeIfElseStatement {
    public static void main(String[] args) {
        //A: 90-100
        //B: 80-89
        //C: 70-79
        //D: 60-69
        //F: 0-59

        //Logic building -java

        //Step 1
        //Find input / outputs
        //Input score-(0-100)->datatype-int
        //Output grade->datatype-char

        //Step 2-Basic logic / Rough logic
        // if score >=90 and score<=100 -> grade ='A'->print grade
        // if score >=80 and score<=89 -> grade ='B'->print grade
        // if score >=70 and score<=79 -> grade ='C'->print grade
        // if score >=60 and score<=69 -> grade ='D'->print grade
        // if score <=59  grade ='F'->print grade

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your score to know your grade");
        int score = scanner.nextInt();
        char grade='F';

        if (score < 0 || score > 100) {
            System.out.println("Invalid score! please enter score between 0-100 to know your grade");
        } else {

            if (score >= 90 && score <= 100) {
                grade = 'A';
            } else if (score >= 80 && score <= 89) {
                grade = 'B';
            } else if (score >= 70 && score <= 79) {
                grade = 'C';
            } else if (score >= 60 && score <= 69) {
                grade = 'D';
            } else {
                grade = 'F';
            }
            System.out.println("Your grade is "+grade);
        }
        scanner.close();
    }
}
