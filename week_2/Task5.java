import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        double startTime = System.nanoTime();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // reading number
        System.out.println(fibonacci(n));

        double endTime = System.nanoTime();
        double duration = (endTime - startTime) / 100000.0;
        System.out.println(duration);

    }

    /**
     * This recursive method calculates the nth Fibonacci number
     * Base cases: If n is 0, return 0; if n is 1, return 1
     * Recursive case: F(n) = F(n-1) + F(n-2)
     * Time Complexity: O(2^n) due to repeated function calls

     * @param n The Fibonacci sequence index
     * @return int The nth Fibonacci number
     */
    static int fibonacci(int n) {
        if (n == 0) return 0;  // Base case
        if (n == 1) return 1;  // Base case
        return fibonacci(n - 1) + fibonacci(n - 2);  // until base case
    }
}
