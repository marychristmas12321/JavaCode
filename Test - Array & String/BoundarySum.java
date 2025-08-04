import java.util.Scanner;

public class BoundarySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input dimensions
        System.out.print("Enter number of rows: ");
        int row = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int col = sc.nextInt();

        // Input array
        int[][] arr = new int[row][col];
        System.out.println("Enter elements of the array:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Calculate boundary sum
        int sum = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                // Check for boundary condition
                if (i == 0 || i == row - 1 || j == 0 || j == col - 1) {
                    sum += arr[i][j];
                }
            }
        }

        // Display the result
        System.out.println("Sum of boundary elements: " + sum);
        sc.close();
    }
}
