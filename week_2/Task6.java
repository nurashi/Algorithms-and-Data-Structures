import java.util.Scanner;

public class PowerRecursive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();  // reading base number
        int n = sc.nextInt();  // reading power of number

        System.out.println((int)power(a, n)); // assertion to int, just as examples in task

    }

    /**
     * Recursive function to compute a^n (a raised to the power of n).
     * Base case: If n == 0, return 1.
     * Recursive case: a^n = a * a^(n-1).
     *
     * Time Complexity: O(n)
     *
     * @param a The base number.
     * @param n The exponent.
     * @return The result of a^n.
     */
    static double power(int a, int n) {
        if (n == 0) return 1;  // Base case
        if (n < 0) return 1.0 / power(a, -n);  // to avoid negative exponents
        return a * power(a, n - 1);  // Recursive step
    }
}
