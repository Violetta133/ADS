import java.util.Scanner;

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

        // 4
        int n = 5;
        System.out.println(FactorialRecursive.factorial(n));

        //5
        int n1 = 5;
        int n2 = 17;
        System.out.println( n1 + " = " + FibonacciRecursive.fibonacci(n1));
        System.out.println( n2 + " = " + FibonacciRecursive.fibonacci(n2));

        // 7
        int i = 4;
        int[] numbers = {1, 4, 6, 2};
        ReversePrint.reversePrint(i - 1, numbers);

         // 8
        String s1 = "123456";
        String s2 = "123a12";
        System.out.println(s1 + " -> " + (CheckDigits.isAllDigits(s1, 0) ? "Yes" : "No"));
        System.out.println(s2 + " -> " + (CheckDigits.isAllDigits(s2, 0) ? "No" : "Yes"));

        // 9
        System.out.println("C(2,1) = " + BinomialCoefficient.binomialCoefficient(2, 1)); // Output: 2
        System.out.println("C(7,3) = " + BinomialCoefficient.binomialCoefficient(7, 3)); // Output: 35

        // 10
        int a = 32, b = 48;
        int c = 10, d = 7;
        System.out.println("GCD of " + a + " and " + b + " is: " + GCD.gcd(a, b));
        System.out.println("GCD of " + c + " and " + d + " is: " + GCD.gcd(c, d));

        }
    }


