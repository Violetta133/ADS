public class FactorialRecursive {
        /**
         * This method calculates the factorial of a given number using recursion.
         * The factorial of a non-negative integer n is defined as:
         * n! = n × (n-1) × (n-2) × ... × 1
         * Base cases:
         * - If n == 0, return 1 (by definition, 0! = 1).
         * - If n == 1, return 1 (since 1! = 1).
         * Recursive case:
         * - Compute factorial as n * factorial(n - 1).
         * Time complexity: O(n), since there are n recursive calls.
         * @param n The number for which the factorial is to be calculated.
         * @return The factorial of n.
         */
        public static int factorial(int n) {
            if (n == 0 || n == 1) {
                return 1; // Base case: 0! = 1 and 1! = 1
            }
            return n * factorial(n - 1); // Recursive case: n! = n * (n-1)!
        }
    }
