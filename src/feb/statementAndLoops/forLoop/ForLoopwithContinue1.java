package feb.statementAndLoops.forLoop;

public class ForLoopwithContinue1 {
    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) {
            if (i % 2==0) {
                System.out.println("Even num-> "+i);
                continue;
            }
           System.out.println("Odd num-> "+i);
        }
        System.out.println("Out side the loop" );
    }
}
