package exercises1;

import java.util.Scanner;

public class C_exercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the wanted conversion");
        System.out.println("1: Celsius to Fahrenheit");
        System.out.println("2: Fahrenheit to Celsius");
        System.out.print(">>>");

        Scanner in = new Scanner(System.in);
        int w = in.nextInt();

        if (w == 1) {
            System.out.println("Fahrenheit to Celsius");
            System.out.println("Enter Celsius");
            int c = in.nextInt();
            int f = (c * 9/5) + 32;
            System.out.println("Celsius in fahrenheit is: " + f);
        } else if (w == 2) {
            System.out.println("Celsius to Fahrenheit");
            System.out.println("Enter Fahrenheit");
            int f = in.nextInt();
            int c = (f - 32) * 5 / 9;
            System.out.println("Fahrenheit in Celsius is: " + c);
        } else {
            System.out.println("Invalid input");
        }
    }
}
