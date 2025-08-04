import java.util.Scanner;

public class PrimeSumInArray {

    // Function to check if a number is prime
    static boolean isPrime(int n) {
        if (n < 2) return false; // 0 and 1 are not prime
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

        // Calculate the sum of prime numbers
        int sum = 0;
        System.out.print("Prime numbers in array: ");
        for (int i = 0; i < size; i++) {
            if (isPrime(arr[i])) {
                System.out.print(arr[i] + " ");
                sum += arr[i];
            }
        }

        // Display the sum
        System.out.println("\nSum of prime numbers in array: " + sum);
        sc.close();
    }
}
