import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine(); // reading string s

        if (isAllDigits(s, 0)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    /**
     * Recursively checks if the string consists only of digits.
     * Time Complexity: O(n), where n is the length of the string.
     *
     * @param s The input string
     * @param index The current index in the string
     * @return true if all characters are digits, otherwise false
     */
    static boolean isAllDigits(String s, int index) {
        if (index == s.length()) return true; // base case
        if (!Character.isDigit(s.charAt(index))){
            return false // if conditions is false, return false, just cheker
        }
        return isAllDigits(s, index + 1); // recursive call for the next character
    }
}
