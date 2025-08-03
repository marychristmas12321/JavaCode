// import java.util.Scanner;

public class upper {
    static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int n = 3;
        // Scanner sc = new Scanner(System.in);
        // n = sc.nextInt();
        int arr[][] = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        int upr, upl, lr, ll;
        upr = upl = lr = ll = 0;
        int upperRight[] = new int[n * n];
        int upperLeft[] = new int[n * n];
        int lowerRight[] = new int[n * n];
        int lowerLeft[] = new int[n * n];
        // upper triangle
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i + j) <= (n - 1)) {
                    upperLeft[upl++] = arr[i][j];
                }
                if ((i + j) >= (n - 1)) {
                    lowerRight[lr++] = arr[i][j];
                }
                if (j >= i) {
                    upperRight[upr++] = arr[i][j];
                }
                if (i >= j) {
                    lowerLeft[ll++] = arr[i][j]; 
                }
            }
        }
        System.out.print("Upper left : ");
        print(upperLeft);
        System.out.print("Lower left : ");
        print(lowerLeft);
        System.out.print("Upper Right : ");
        print(upperRight);
        System.out.print("Lower Right : ");
        print(lowerRight);
        // 1 2 3 4 5 7 0 0 0
        // 1 4 5 7 8 9 0 0 0
        // 1 2 3 5 6 9 0 0 0
        // 3 5 6 7 8 9 0 0 0 // ur

        // sc.close();
    }
}

// int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
// System.out.println("URT");
// for (int i = 0; i < 3; i++) {
// for (int j = 0; j < 3; j++) {
// if (j >= i) {
// System.out.print(arr[i][j] + " ");
// } else {
// System.out.print(" ");
// }
// }
// System.out.println();
// }
// }

// int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
// System.out.println("ULT");
// for (int i = 0; i < 3; i++) {
// for (int j = 0; j < 3; j++) {
// if (i+j <= n-1) { //n=3
// System.out.print(arr[i][j] + " ");
// } else {
// System.out.print(" ");
// }
// }
// System.out.println();
// }
// }

// int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
// System.out.println("LLT");
// for (int i = 0; i < 3; i++) {
// for (int j = 0; j < 3; j++) {
// if (i>=j) { //n=3
// System.out.print(arr[i][j] + " ");
// } else {
// System.out.print(" ");
// }
// }
// System.out.println();
// }
// }

// int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
// System.out.println("LRT");
// for (int i = 0; i < 3; i++) {
// for (int j = 0; j < 3; j++) {
// if (i+j >= n-1) { //n=3
// System.out.print(arr[i][j] + " ");
// } else {
// System.out.print(" ");
// }
// }
// System.out.println();
// }
// }
