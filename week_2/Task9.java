import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        System.out.println(binomialCoff(n, k));
    }

    /**
     * Recursively calculates the binomial coefficient C(n, k).
     * Uses the formula: C(n, k) = C(n-1, k-1) + C(n-1, k)
     * Base cases: C(n, 0) = C(n, n) = 1
     * Time Complexity: O(2^n) - Exponential time due to recursive branching.
     * Space Complexity: O(n) - Recursion depth goes up to n.
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
