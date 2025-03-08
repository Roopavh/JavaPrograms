package feb.statementAndLoops.forLoop;

public class ForLoopEx1 {
    public static void main(String[] args) {
        // for loop-helps to repeat a block of code
        //1. Initialization
        //2. Condition
        //3. Increment/Decrement

        // Note:If no initialization, condition and increment/decrement part leads infinite loop
/*
        for (; ;) {
            System.out.println("Roopa");
        }

        for (int i=0; i<=10;) {
            System.out.println(i);
        }


        for (int j=0; ;j++){
            System.out.println(j);
        }

 */
        // correct for loop syntax
        for (int i=0 ; i<=10; i++ ){
            System.out.println(i);
            i++; // incrementing again
        }


    }
}