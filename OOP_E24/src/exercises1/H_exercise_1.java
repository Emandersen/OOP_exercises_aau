package exercises1;

import java.util.Scanner;

public class H_exercise_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your weight in kg: ");
        double weight = scanner.nextDouble();

        weight = weight * 0.165;

        System.out.println("Your weight on the moon is " + weight + " kg.");  
    }
}