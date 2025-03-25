import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        double startTime = System.nanoTime();

        Scanner sc = new Scanner(System.in);

        // reading the size of the array
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("size 0, no answer");
            return;
        }


        int[] arr = new int[n];

        // Reading array elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(Average(arr));


        double endTime = System.nanoTime();
        double duration = (endTime - startTime) / 100000.0;
        System.out.println(duration);

    }

    /**
     * This method calculates the average of an array of integers.
     * It iterates through the array using a for loop to sum up all elements.
     * Then, it divides the sum by the number of elements to get the average.
     *
     * Time Complexity: O(n), since it iterates through the array once.
     *
     * @param arr The input array of integers.
     * @return double The calculated average of the array elements.
     */
    static double Average(int[] arr) {
        if(arr.length == 1) {
            return arr[0]; // Constand time complexity if array consists only one element
        }
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return (double) sum / arr.length; // Casting to double for precise division
    }
}
