public class CheckDigits {
        /**
         * This method checks if all characters in a given string are digits.
         * It uses a recursive approach, checking each character one by one.
         * Base case: If the index reaches the length of the string, return true.
         * Recursive case: If a non-digit character is found, return false;
         * otherwise, continue checking the next character.
         * Time complexity: O(n), where n is the length of the string.
         * @param s The input string to be checked.
         * @param index The current index being checked in the string.
         * @return true if all characters in the string are digits, false otherwise.
         */
        public static boolean isAllDigits(String s, int index) {
            if (index == s.length()) return true;
            if (!Character.isDigit(s.charAt(index))) return false; // Check if current char is not a digit (O(1)).
            return isAllDigits(s, index + 1); // Recursive call to check next character (O(n) calls).
        }
}
