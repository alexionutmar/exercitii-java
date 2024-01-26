package chapter4;

import java.util.Scanner;

//introduce un caracter si afiseaza echivalentul lui in unicode
public class UnicodeFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a character
        System.out.print("Enter a character: ");

        // Read the character entered by the user
        char inputChar = scanner.next().charAt(0);

        // Display the Unicode of the character
        System.out.println("The Unicode of '" + inputChar + "' is: " + (int) inputChar);

        // Close the scanner to avoid resource leak
        scanner.close();
    }
}
