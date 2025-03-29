public class PrimeChecker {
        /**
         * This method checks whether a given number is prime.
         * Time Complexity:
         * - If n is 2 or 3, it is directly checked in O(1).
         * - If n is even or divisible by 3, it is eliminated in O(1).
         * - We check divisibility from 5 to √n, skipping even numbers.
         * - The loop runs approximately O(√n) times, making the time complexity **O(√n)**.
         * @param n The number to check.
         * @return true if n is prime, false otherwise.
         */
        public static boolean isPrime(int n) {
            if (n <= 1) return false;
            if (n <= 3) return true;
            if (n % 2 == 0 || n % 3 == 0) return false;

            // Check for factors from 5 to sqrt(n), skipping even numbers
            for (int i = 5; i * i <= n; i += 6) {
                if (n % i == 0 || n % (i + 2) == 0) {
                    return false;
                }
            }

            return true;
        }

}
