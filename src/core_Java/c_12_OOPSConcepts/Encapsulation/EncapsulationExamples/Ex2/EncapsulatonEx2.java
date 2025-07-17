package core_Java.c_12_OOPSConcepts.Encapsulation.EncapsulationExamples.Ex2;

public class EncapsulatonEx2 {
    public static void main(String[] args) {
        //Accessing data members with the help of methods
        ICICIBank iciciBank=new ICICIBank("Vinmayi",1000);
        long bal=iciciBank.getBal();
        System.out.println(bal);

        iciciBank.setBal(500,true);
        long updated_bal=iciciBank.getBal();
        System.out.println(updated_bal);

        iciciBank.setBal(3000,false);
        updated_bal=iciciBank.getBal();
        System.out.println(updated_bal);

    }
}

class ICICIBank{
    private String name;
    private long bal;

    ICICIBank(String name, long bal){
       this.name=name;
       this.bal=bal;
    }


    //bundling data members with setter and getter methods
    public long getBal() {
        return bal;
    }

    public void setBal(long bal, boolean isChashier) {
        if (isChashier){
            this.bal = bal;
            System.out.println("Balance updated successfully");
        }else {
            System.out.println("Not allowed to change the balance");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
