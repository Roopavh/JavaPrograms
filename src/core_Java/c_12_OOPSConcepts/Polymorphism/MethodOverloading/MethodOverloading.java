package core_Java.c_12_OOPSConcepts.Polymorphism.MethodOverloading;

public class MethodOverloading {
    public static void main(String[] args) {
        // Method Overloading
        // Defining multiple methods in the same class with the same name but different parameters
        //  Method Overloading-Method will overload,Same name but different parameters/arguments
        // JVM will figure it out which function to be used based on passed arguments while compile time only

        MathOperations mathOperations=new MathOperations();
        int result=mathOperations.add();

        int result1= mathOperations.add(1.3f,2.2f);
        System.out.println(result1);

    }
}

class MathOperations{


    int add(int a,int b){
        return a+b;
    }

    float add(int a, int b ,float c){
        return a+b+c;
    }

    int add(float a, float b){
        return (int) (a+b);
    }

    int add(){
        return 0;
    }

}
