package core_Java.c_9_Arrays;

public class FindMaxandMinValue {
    public static void main(String[] args){

        int[] array= {55,65,90,25,77,44,35};
        int max_value=give_max(array);
        System.out.printf("Max number is %d",max_value);

        int min_value=give_min(array);
        System.out.printf("Min number is %d",min_value);
    }


    static int give_max(int[] array){
        int max=array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i]>max){
                max=array[i];
            }
        }
        return max;
    }

    static int give_min(int[] array){
        int min=array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i]<min){
                min=array[i];
            }
        }
        return min;
    }
}
