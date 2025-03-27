import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {

        double startTime = System.nanoTime();

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        System.out.println(binomialCoff(n, k));

        double endTime = System.nanoTime();
        double duration = (endTime - startTime) / 100000.0;
        System.out.println(duration);

    }

    /**
     * Recursively calculates the binomial coefficient C(n, k).
     * Uses the formula: C(n, k) = C(n-1, k-1) + C(n-1, k)
     * Base cases: C(n, 0) = C(n, n) = 1
     * Time Complexity: O(2^n) - Exponential time due to recursive branching.
     * Space Complexity: O(n) - Recursion depth goes up to n.1
     *
     * @param n Total elements
     * @param k Chosen elements
     * @return Binomial coefficient C(n, k)
     */
    static int binomialCoff(int n, int k) {
        if (k == 0 || k == n) {
            return 1; // Base case
        }
        return binomialCoff(n - 1, k - 1) + binomialCoff(n - 1, k);
    }
}
