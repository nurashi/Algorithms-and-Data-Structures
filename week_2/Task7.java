import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        double startTime = System.nanoTime();

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // reading numbers count

        reversePrint(n, sc);

        double endTime = System.nanoTime();
        double duration = (endTime - startTime) / 100000.0;
        System.out.println();
        System.out.println(duration);
    }

    /**
     * Recursive function to read and print elements in reverse order.
     * First, it reads the input, then calls itself recursively before printing.
     * Time Complexity: linear time O(n), because its just iteretes until count - 1 will be 0
     * @param count Number of elements left to read
     * @param sc    Scanner object for input
     */
    static void reversePrint(int count, Scanner sc) {
        if (count == 0) return; // input -> from n to n-1 until 0, base case

        int num = sc.nextInt(); // reading current number
        reversePrint(count - 1, sc);
        System.out.print(num + " "); // Print after recursion, to print in reverse order
    }
}
