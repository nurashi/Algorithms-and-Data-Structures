package week_2;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();  // Read n

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();  // Read array elements
        }
    }



    /**
     * This method finds minimum element of the array
     * it usus for loop to inarate through the array
     * O(n) linear time complexity
     * The for loop iterates from 1(because min already equal to arr[0]) to array length
     * @param min The minimum that will finded
     * @return int type that returns min variable after all operations
     */
    static int Min(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
}
