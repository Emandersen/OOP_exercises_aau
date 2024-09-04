package exercises1;

import java.util.Scanner;

public class F_exercise {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = scanner.nextLine();
        int vowelCount = 0;
        int consonantCount = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLetter(ch)) {
                switch(ch) {
                    case 'a':
                        vowelCount++;
                        break;
                    case 'e':
                        vowelCount++;
                        break;
                    case 'i':
                        vowelCount++;
                        break;
                    case 'o':;
                        vowelCount++;
                        break;
                    case 'u':
                        vowelCount++;
                        break;
                    default:
                        consonantCount++;
                        break;
                }

            }
        }
        System.out.println("Vowels: " + vowelCount);
        System.out.println("consonants: " + consonantCount);


    }
}
