package core_Java.c_4_Operators;

public class TernaryOperators {
    public static void main(String[] args) {
      /*
        Ternary operator also known as conditional operator
        Evaluate the condition and returns one of the two values based on the result
        It similar to if else statement

        Syntax of ternary operator
        result = condition ? expression1 : expression2;
*/

        int age=18;

        String result= age>18 ? "Allowed for voting":"Not allowed for voting";
        System.out.println(result);

        //Maximum of two numbers
        int a=30;
        int b=20;
        String max=a>b ? ("max number is " + a):("Max number is " +b);
        System.out.println(max);

     //Nested ternary operator
     //    score >=90 grade A
     //    score >=80 grade B
     //    score >=70 grade C
     //    score >=60 grade D
     //    score <60 grade F

        int score=80;
       // score=00;

        String grade=(score>=90) ? "A":(score>=80) ? "B" :(score>=70) ? "C":(score>=60)? "D":"F";
        System.out.println("Your grade is "+ grade);
        System.out.printf("Your grade is %s ",grade);
        System.out.println();

     // Find the largest number in three numbers

        int x= 100;
        int y= 200;
        int z= 30;

        int largest_number= (x>=y && x>=z) ? x : (y>=z)? y : z;
        System.out.println("The largest number is " +largest_number);
    }
}
