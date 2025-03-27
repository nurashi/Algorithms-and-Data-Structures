import java.util.Scanner;

public class GCDRecursive {
    public static void main(String[] args) {

        double startTime = System.nanoTime();

        Scanner sc = new Scanner(System.in);


        // reading elements
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(gcd(a, b));

        double endTime = System.nanoTime();
        double duration = (endTime - startTime) / 100000.0;
        System.out.println(duration);
    }
    /**
     * Recursively calculates the Greatest Common Divisor (GCD) using Euclidean Algorithm.
     * Formula: GCD(a, b) = GCD(b, a % b)
     * Base Case: GCD(a, 0) = a
     *
     * Time Complexity: O(log(min(a, b))) - Logarithmic time complexity.
     * Space Complexity: O(log(min(a, b))) - Recursive depth.
     *
     * @param a First number
     * @param b Second number
     * @return GCD of a and b
     */
    static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
