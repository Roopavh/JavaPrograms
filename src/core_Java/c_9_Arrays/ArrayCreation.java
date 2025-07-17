package core_Java.c_9_Arrays;

import java.util.Arrays;

public class ArrayCreation {
    public static void main(String[] args){
    /*
        Array -> Collection of data which is of similar type
        Its also called as Homogeneous data structure

        There are two ways can create arrays
         1. Using (=) assignment operator(Assigning values directly to variable)
         2. Using new operator(Creating Array object)

        Disadvantages of Arrays
         1. It's fixed in size
         2. It can store only same data type values
         3. Addition/Deletion of element is complex-Have to use shift operators

     */

        int[] i={12,45,55,65,99,22};//First way creation
        //Printing the values
        for (int m = 0; m < i.length; m++) {
            System.out.println(i[m]);
        }


        //Second way creating arrays
        int[] j=new int[3];
        j[0]=12;
        j[1]=13;
        j[2]=45;

        System.out.println("Length of array is "+j.length);
        //printing array values
        for (int k = 0; k < j.length; k++) {
            System.out.println(j[k]);
        }

    }


}
