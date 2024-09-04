package exercises1;

import java.util.Scanner;

public class B_exercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a char: ");
        char ch = scanner.next().charAt(0);

        switch(ch) {
            case 'a':
                ifVowel();
                break;
            case 'e':
                ifVowel();
                break;
            case 'i':
                ifVowel();
                break;
            case 'o':;
                ifVowel();
                break;
            case 'u':
                ifVowel();
                break;
            default:
                System.out.println("Not a vowel");
                break;
        }
    }

    public static void ifVowel() {
        System.out.println("is a vowel");
    }
}
