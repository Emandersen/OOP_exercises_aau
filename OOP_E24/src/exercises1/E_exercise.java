package exercises1;

import java.util.Random;
import java.util.Scanner;

public class E_exercise {
    public static void main(String[] args) {
        Random rand = new Random();

        int rand_int = rand.nextInt(10);
        boolean won = false;
            while (!won) {
            System.out.println("Enter a random number between 1 and 10 ");

            Scanner sc = new Scanner(System.in);



            int n = sc.nextInt();
            if (rand_int == n) {
                System.out.println("The number is " + n);
                System.out.println("You are correct");
                won = true;
            } else if (rand_int > n) {
                System.out.println("The number is greater than " + n);
            } else {
                System.out.println("The number is less than " + n);
            }
        }
    }
}
