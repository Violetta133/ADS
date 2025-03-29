public class ReversePrint {
    /**
     * This class provides a method to print an array in reverse order using recursion.
     * Recursively prints the elements of an array in reverse order.
     * *The function starts from the last index and prints elements one by one,
     * Time Complexity: O(n), where n is the number of elements in the array.
     * * The function is called once for each element, leading to linear complexity.
     * @param index The current index of the element to print.
     * @param numbers The array containing the numbers to be printed in reverse order.
     */
    public static void reversePrint(int index, int[] numbers) {
        if (index < 0) {
            return;
        }
        System.out.print(numbers[index] + " ");
        reversePrint(index - 1, numbers);
    }
}