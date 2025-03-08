package core_Java.c_6_StatementAndLoops.forLoop;

public class ForLoopwithContinue {
    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) {
            if (i == 5) {
                continue; // control will be moved to top to loop again(Skip the below code and move to top of loop)
            }
            System.out.println(i);
        }
        System.out.println("Out side the loop");
    }
}
