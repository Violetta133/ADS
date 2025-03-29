public class Main {
    public static void main(String[] args) {
        // 1
        int[] arr1 = {10, 1, 32, 3, 45};
        System.out.println("Minimum: " + ProblemSolution.findMinimum(arr1));

        // 2
        int[] arr2 = {3, 2, 4, 1};
        System.out.println("Average: " + Average.calculateAverage(arr2)); // Output: 2.5

        // 3
        int num1 = 7;
        int num2 = 10;
        System.out.println(num1 + " is " + (PrimeChecker.isPrime(num1) ? "Prime" : "Composite"));
        System.out.println(num2 + " is " + (PrimeChecker.isPrime(num2) ? "Prime" : "Composite"));
    }
}