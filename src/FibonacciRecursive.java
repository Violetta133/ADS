public class FibonacciRecursive {
    /**
     * This method calculates the nth Fibonacci number using a recursive approach.
     * The Fibonacci sequence is defined as:
     * F(0) = 0, F(1) = 1
     * F(n) = F(n-1) + F(n-2) for n ≥ 2
     * Base cases:
     * - If n == 0, return 0.
     * - If n == 1, return 1.
     * Recursive case: Compute F(n) as the sum of the two preceding Fibonacci numbers.
     * Time complexity: O(2^n), due to exponential growth from repeated calculations.
     * @param n The position in the Fibonacci sequence.
     * @return The nth Fibonacci number.
     */
    public static int fibonacci(int n) {
        if (n == 0) return 0; // Base case: F(0) = 0
        if (n == 1) return 1; // Base case: F(1) = 1
        return fibonacci(n - 1) + fibonacci(n - 2); // Recursive case
    }
}
