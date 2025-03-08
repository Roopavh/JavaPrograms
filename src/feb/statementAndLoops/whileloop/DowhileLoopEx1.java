package feb.statementAndLoops.whileloop;

public class DowhileLoopEx1 {
    public static void main(String[] args) {
        // do while loop is "exit-controlled loop"
        // Block of code ll be executed at least once and condition is checked after the body has been executed

        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= 10);
    }
}
