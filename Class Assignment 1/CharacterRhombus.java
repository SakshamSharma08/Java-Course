import java.util.Scanner;

public class CharacterRhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask user for number of rows
        System.out.print("Enter the number of rows for the rhombus: ");
        int n = sc.nextInt();

        // Upper half including the middle row
        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }

            // Print increasing characters
            for (char ch = 'A'; ch < 'A' + i; ch++) {
                System.out.print(ch);
            }

            // Print decreasing characters
            for (char ch = (char) ('A' + i - 2); ch >= 'A'; ch--) {
                System.out.print(ch);
            }

            System.out.println();
        }

        // Lower half
        for (int i = n - 1; i >= 1; i--) {
            // Print leading spaces
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }

            // Print increasing characters
            for (char ch = 'A'; ch < 'A' + i; ch++) {
                System.out.print(ch);
            }

            // Print decreasing characters
            for (char ch = (char) ('A' + i - 2); ch >= 'A'; ch--) {
                System.out.print(ch);
            }

            System.out.println();
        }

        sc.close();
    }
}
