public class GCD {
    /**
     * This method calculates the Greatest Common Divisor (GCD) of two integers
     * using the Euclidean Algorithm.
     * The algorithm is based on the principle that gcd(a, b) = gcd(b, a % b)
     * and continues recursively until b becomes 0, at which point a is the GCD.
     * Time complexity: O(log(min(a, b))), since the algorithm reduces the problem size
     * approximately by half in each step.
     * @param a The first integer.
     * @param b The second integer.
     */
    public static int gcd(int a, int b) {
        // Base case: if b becomes 0, return a
        if (b == 0) {
            return a;
        }
        // Recursive case: gcd(b, a % b)
        return gcd(b, a % b);
    }
}
