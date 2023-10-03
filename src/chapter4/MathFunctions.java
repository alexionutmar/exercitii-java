package chapter4;

public class MathFunctions {
    public static void main(String[] args) {
        char ch = (char)65.2; //into int (65)
        System.out.println(ch); //ch is character 'A'

        int a = (int)'A'; //it is converted to the unicode code
        System.out.println(a);

        if (ch >= 'A' && ch <= 'Z')
            System.out.println(ch + " is an uppercase letter");
        else if (ch >= 'a' && ch <= 'z')
            System.out.println(ch + " is a lowercase letter");
        else if (ch >= '0' && ch <= '9')
            System.out.println(ch + " is a numeric character");

        /*
        * Use print statements to find out the ASCII code for '1', 'A', 'B', 'a', and 'b'.
        * Use print statements to find out the character for the decimal codes 40, 59, 79, 85, and 90.
        * Use print statements to find out the character for the hexadecimal code 40, 5A, 71, 72, and 7A.*/

        System.out.println("ascii for:\n 1, A, B, a, b: ");
        System.out.println(" " + (int)'1'+ " " + (int)'A'+ " " + (int)'B'+ " " + (int)'a'+ " " + (int)'b');

        System.out.println("characters for de decimals:\n 40, 59, 79, 85, 90");
        System.out.println(" " + (char)40 + " " + (char)59 + " " + (char)79 + " " + (char)85 + " " + (char)90);

        System.out.println("characters for de hexadecimals:\n 40, 5A, 71, 72, 7A");
        System.out.println(" " + (char)0X40 + " " + (char)0X5A + " " + (char)0X71 + " " + (char)0X72 + " " + (char)0X7A);
    }
}
