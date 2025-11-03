import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Asking for input
        System.out.print("Enter a single character from the alphabet: ");
        String input = sc.nextLine();

        // Check if input length is 1 and is a letter
        if (input.length() == 1 && Character.isLetter(input.charAt(0))) {
            char ch = Character.toLowerCase(input.charAt(0));

            // Check for vowels
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println("Vowel");
            } else {
                System.out.println("Consonant");
            }
        } else {
            // Error for invalid input
            System.out.println("Error: Please enter a single alphabet character only.");
        }

        sc.close();
    }
}
