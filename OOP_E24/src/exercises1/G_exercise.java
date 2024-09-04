package exercises1;

public class G_exercise {
    public static void main(String[] args) {
        for (int num = 0; num < 100; num++) {
            if (isPrime(num)) {
                System.out.println(num + " is a prime number.");
            }
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
