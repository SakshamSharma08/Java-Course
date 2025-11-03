// DistanceTest.java
import java.util.Scanner;

public class DistanceTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first distance:");
        System.out.print("Feet: ");
        float feet1 = sc.nextFloat();
        System.out.print("Inch: ");
        float inch1 = sc.nextFloat();

        System.out.println("\nEnter second distance:");
        System.out.print("Feet: ");
        float feet2 = sc.nextFloat();
        System.out.print("Inch: ");
        float inch2 = sc.nextFloat();

        // Create objects
        Distance d1 = new Distance(feet1, inch1);
        Distance d2 = new Distance(feet2, inch2);

        // Display the result
        d1.sum(d2);

        sc.close();
    }
}
