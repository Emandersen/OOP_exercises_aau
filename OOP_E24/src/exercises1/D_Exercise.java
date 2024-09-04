package exercises1;

import java.math.BigInteger;

public class D_Exercise {
    public static void main(String[] args) {
        int milliseconds = 1000000000;

        int sec = (milliseconds / 1000) % 60;
        int min = (milliseconds / (1000 * 60)) % 60;
        int hours = (milliseconds / (1000 * 60 * 60)) % 24;
        int days = milliseconds / (1000 * 60 * 60 * 24);


        System.out.println("Days: " + days);
        System.out.println("Hours: " + hours);
        System.out.println("minutes: " + min);
        System.out.println("Seconds: " + sec);
    }
}
