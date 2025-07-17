package core_Java.c_11_Constructors;

public class ConstructorOverloading {

    // Constructor overloading-> multiple constructors with the same name (class name) but different parameters
    public static void main(String[] args) {
       Car3 default_con=new Car3();
        System.out.println(default_con.model_name+" "+default_con.year);

        Car3 para_1=new Car3("Tata");
        System.out.println(para_1.model_name+" "+para_1.year);

        Car3 para_2=new Car3("Bajaj",2001);
        System.out.println(para_2.model_name+" "+para_2.year);
    }
}

class Car3{
    String model_name;
    int year;

    //Default constructor-no parameters
    Car3(){
        model_name="Nano";
        year=2000;
    }

    Car3(String model_name){
        this.model_name=model_name;
        year=1999;
    }

    Car3(String model_name,int year){
        this.model_name=model_name;
        this.year=year;
    }
}