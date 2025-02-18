package practice.java;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class ins {

    // Method to count the number of digits in a number
    public static int countDigits(int n) {
        return String.valueOf(n).length();
    }

    // Method to find the number of distinct prime factors of a number
    public static int distinctPrimeFactors(int n) {
        Set<Integer> factors = new HashSet<>();
        
        // Check for number of 2s
        while (n % 2 == 0) {
            factors.add(2);
            n /= 2;
        }
        
        // Check for odd factors
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            while (n % i == 0) {
                factors.add(i);
                n /= i;
            }
        }
        
        // If n is a prime number greater than 2
        if (n > 2) {
            factors.add(n);
        }
        
        return factors.size();
    }

    // Method to count the mischievous numbers in the range [L, R]
    public static int mischievousNumbers(int L, int R) {
        int count = 0;
        for (int number = L; number <= R; number++) {
            if (countDigits(number) == distinctPrimeFactors(number)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading input L and R
        int L = scanner.nextInt();
        int R = scanner.nextInt();

        // Output the result
        System.out.println(mischievousNumbers(L, R));

        scanner.close();
    }
}
