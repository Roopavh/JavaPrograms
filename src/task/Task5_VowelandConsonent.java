package task;

import java.util.Scanner;

public class Task5_VowelandConsonent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the word to know vowels and consonants : ");
        String string = scanner.next();

        string = string.toLowerCase();

        int vowelCount = 0;
        int consCount = 0;

        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            } else if (ch >= 'a' && ch <= 'z') {
                consCount++;
            }
        }
        System.out.println("Vowels count: " + vowelCount);
        System.out.println("Consonants count: " + consCount);
        scanner.close();
    }
}
