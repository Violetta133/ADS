public class Power {
    /**
     * Computes the power of a given base 'a' raised to exponent 'n'.
     * Uses Math.pow(), which internally performs exponentiation efficiently.
     * @param a The base number.
     * @param s The exponent.
     * @return The result of a^n as a long.
     */
    public static double power(double a, int s) {
        double result = 1;
        for (int i = 0; i < s; i++) {
            result *= a;
        }
        return result;
    }
}