import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        double startTime = System.nanoTime();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // reading number

        if (isPrime(n)) {
            System.out.println("Prime");
        } else {
            System.out.println("Composite");
        }

        double endTime = System.nanoTime();
        double duration = (endTime - startTime) / 100000.0;
        System.out.println(duration);
    }

    /**
     * This method checks if a number is prime.
     * It iterates from 2 to sqrt(n) and checks if n is divisible by any number.
     * If n is divisible by any of them, it will return false.
     *
     * Time Complexity: O(n^(1/2)) -> sqrt(n)
     *
     * @param n The number to check.
     * @return boolean True if prime, false otherwise.
     */
    static boolean isPrime(int n) {
        if (n < 2) return false; // 0 and 1 are not prime
        for (int i = 2; i * i <= n; i++) { // Checking divisibility up to sqrt(n)
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
