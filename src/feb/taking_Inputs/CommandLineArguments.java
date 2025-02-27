package feb.taking_Inputs;

public class CommandLineArguments {

    /*There are three ways we can use for user inputs
    1. Command Line Arguments(Console) from program itself by configuration
    2. Sanner class
    3. BufferReader(Input Stream)
*/
    //Console Arguments-> We can get inputs from user directly from program

    public static void main(String[] args) {

        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println(args[2]);
        System.out.printf("%s ,%s ,%S",args[0],args[1],args[2]);
        System.out.println();

        int age=Integer.parseInt(args[1]);
        String result=(age>=18)? "Allowed to vote": "Not allowed to vote";
        System.out.println(result);

    }
}
