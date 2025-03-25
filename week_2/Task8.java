import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {

        double startTime = System.nanoTime();

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine(); // reading string s

        if (isAllDigits(s)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        double endTime = System.nanoTime();
        double duration = (endTime - startTime) / 100000.0;
        System.out.println(duration);
    }

    /**
     * This method checks if the string consists only of digits.
     * Time Complexity: O(n) where n is the length of the string.
     * @param s The input string
     * @return true if all characters are digits, otherwise false
     */
    static boolean isAllDigits(String s) {
        for (char c : s.toCharArray()) { // calling method toCharArray which is in base java, to iterate through the array
            if (!Character.isDigit(c)) { // calling method isDigit to find and using ! to find any non number
                return false;
            }
        }
        return true;
    }
}
