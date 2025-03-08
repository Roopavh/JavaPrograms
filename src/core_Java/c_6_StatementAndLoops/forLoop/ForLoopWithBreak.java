package core_Java.c_6_StatementAndLoops.forLoop;

public class ForLoopWithBreak {
    public static void main(String[] args) {
        for (int i = 0; i <=50 ; i++) {
            if (i == 5) {
                System.out.println("Five");
                break;   // break ll be to used terminate block and will continue further lines of code
            }
            System.out.println(i);
        }
        System.out.println("Out side loop");
    }
}
