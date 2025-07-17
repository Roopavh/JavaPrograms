package core_Java.c_11_Constructors;

import java.util.Scanner;

public class ParameterizedConstructor {
    public static void main(String[] args) {
        Car1 c1=new Car1("Nano",1990);
        System.out.println(c1.model_name+" "+c1.year);

        Car1 c2=new Car1("TATA",2000);
        System.out.println(c2.model_name+" "+c2.year);

        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter model name: ");
        String model_name=scanner.next();

        System.out.print("Enter year: ");
        int year=scanner.nextInt();

        Car1 c3=new Car1(model_name,year);
        System.out.println(c3.model_name+" "+c3.year);

        c1.car1_details();
        c2.car1_details();
        c3.car1_details();

    }
}

class Car1{
    String model_name;
    int year;

    Car1(String model_name,int year)
    {
        // this is a reference variable that refers to current object within method or constructor
        // c1->this, c2->this, c3->this
        this.model_name=model_name;
        this.year=year;
    }

    public void car1_details(){
        System.out.println("Car Details -> "+this.model_name+" "+this.year);
    }
}