public class Average {
    /**
     * This method calculates the average of an array of integers.
     * It iterates through all elements of the array to compute the sum
     * and then divides it by the number of elements to get the average.
     * Time complexity: O(n), where n is the number of elements in the array.
     * @param arr The array of integers for which the average is to be calculated.
     * @return The average value as a double.
     * @throws ArithmeticException if the array length is zero to prevent division by zero.
     */
    public static double calculateAverage(int[] arr) {
        if (arr.length == 0) {
            throw new ArithmeticException("Array length must be greater than zero.");
        }

        int sum = 0;

        // Summing up all elements in the array
        for (int num : arr) {
            sum += num;
        }

        // Calculating the average by dividing sum by the number of elements
        return (double) sum / arr.length;
    }
}




