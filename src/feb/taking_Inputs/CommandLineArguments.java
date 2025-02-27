package feb.taking_Inputs;

public class CommandLineArguments {

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
