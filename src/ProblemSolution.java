public class ProblemSolution {
    /**
     * Finds the minimum element in an integer array.
     * This method iterates through the array and keeps track of the smallest element found.
     * * Time Complexity: O(n) – we iterate through all n elements once.
     * @param arr The input array of integers.
     * @return The smallest element in the array.
     */

    public static int findMinimum(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        // Time Complexity: O(n)
        return min;
    }
}