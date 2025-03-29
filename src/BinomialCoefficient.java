public class BinomialCoefficient {
    /**
     * Recursively calculates the binomial coefficient C(n, k).
     * Time Complexity: O(2^n) - Exponential due to repeated subproblems.
     * @param n Total number of items.
     * @param k Chosen items.
     * @return The binomial coefficient C(n, k).
     */
    public static int binomialCoefficient(int n, int k) {
        if (k == 0 || k == n) return 1; // Base case: C(n, 0) = C(n, n) = 1
        return binomialCoefficient(n - 1, k - 1) + binomialCoefficient(n - 1, k); // Recursive formula
    }
}
