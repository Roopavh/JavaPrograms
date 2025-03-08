package feb.statementAndLoops.whileloop;

public class DowhileEx2 {
    public static void main(String[] args) {

        int a=0;
        do {
            System.out.println("print "+a);
            a++;
        }while (a<0);

        System.out.println("Difference between while and do while loop");

        while(a<0){
            System.out.println("Print "+a);
            a++;
        }
        System.out.println("Out of while loop");
    }
}
