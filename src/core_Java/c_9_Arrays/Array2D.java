package core_Java.c_9_Arrays;

public class Array2D {
    public static void main(String[] args) {
        int[][] num = {{1, 2, 3}, {3,4,5}, {6, 7, 8}};
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                System.out.print(num[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
