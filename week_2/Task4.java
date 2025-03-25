import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int n = sc.nextInt();  // reading number

        System.out.println(factorial(n));
    }

    /**
     * This recursive method calculates the factorial of a number.
     * Base case: If n is 0 or 1, return 1.
     * Recursive case: n! = n * (n-1)!
     *
     * Time Complexity: O(n) (since it makes n recursive calls)
     *
     * @param n The number to compute factorial of.
     * @return int The factorial of n.
     */
    static int factorial(int n) {
        if (n == 0 || n == 1) return 1;  // Base cases
        return n * factorial(n - 1); // until base cases
    }
}
