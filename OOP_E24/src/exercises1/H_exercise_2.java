package exercises1;

public class H_exercise_2 {
    public static void main(String[] args) {
        final double INCHES_PER_METER = 39.37;
        final int FEET = 12;
        final int INCHES_PER_FOOT = 12;

        for (int i = 1; i <= FEET * INCHES_PER_FOOT; i++) {
            double meters = i / INCHES_PER_METER;
            System.out.printf("%d inches = %.4f meters%n", i, meters);

            if (i % INCHES_PER_FOOT == 0) {
                System.out.println();
            }
        }
    }
}
