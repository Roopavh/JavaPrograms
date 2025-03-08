package feb.statementAndLoops.forLoop;

public class ForLoopEx3 {
    public static void main(String[] args) {
        // To find even numbers from 1 to 50
        for (int i = 0; i < 50; i++) {
            if (i%2==0){
                System.out.println("Even num: "+ i);
            }else {
                System.out.println("Odd num: "+ i);
            }
        }
    }
}
