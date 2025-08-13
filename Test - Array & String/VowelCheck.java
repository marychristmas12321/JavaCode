import java.util.Scanner;

public class VowelCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Convert to lowercase to simplify comparison
        input = input.toLowerCase();

        boolean found = false;
        System.out.print("Vowels in the string: ");

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            // Check for vowels
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.print(ch + " ");
                found = true;
            }
        }

        // If no vowel was found
        if (!found) {
            System.out.print("No vowels found.");
        }
        sc.close();
    }
}

