package exercises1;

import java.util.Scanner;

public class A_exercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a length: ");
        double length = sc.nextDouble();

        length /= 3.281;

        System.out.print("In meters: " + length);

    }
}
