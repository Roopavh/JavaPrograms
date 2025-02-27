package task;

public class Task1_CommondlineArguments {
    public static void main(String[] args) {

        int a=Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);

        int largest_num=(a>=b)? a : b;
        System.out.printf("Largest number is %d",largest_num);
    }
}
