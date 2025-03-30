public class DegreeFinder {
    public int m;
    public int w;

    public DegreeFinder(int m, int w) {
        this.m = m;
        this.w = w;
    }

    /**
     * This method calculates the power of a number using iteration.
     * It raises the base 'm' to the exponent 'w'.
     * Time complexity: O(w), where w is the exponent.
     * The algorithm iterates 'w' times, multiplying the base 'm' in each step.
     *
     * @return The result of m^w.
     */
    public int calculateDegree() {
        int multiplier = 1;
        for (int i = 0; i < w; i++) {
            multiplier *= m;
        }
        return multiplier;
    }
}