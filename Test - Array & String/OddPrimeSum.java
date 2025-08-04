import java.util.Scanner;

public class OddPrimeIndexSum {
    // Function to check if a number is prime
    static boolean isPrime(int n) {
        if (n < 2)
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        // Input array elements
        int[] arr = new int[size];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // Calculate sum of elements at odd prime indices
        int sum = 0;
        for (int i = 0; i < size; i++) {
            if (isPrime(i) && i % 2 != 0) {
                sum += arr[i];
            }
        }

        // Output the result
        System.out.println("Sum of elements at odd prime indices: " + sum);
    }
}
