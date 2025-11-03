// PointApplication.java
import java.util.Scanner;

public class PointApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for first point
        System.out.print("Enter x1: ");
        double x1 = sc.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = sc.nextDouble();

        // Input for second point
        System.out.print("Enter x2: ");
        double x2 = sc.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = sc.nextDouble();

        // Create Point objects
        Point p1 = new Point(x1, y1);
        Point p2 = new Point(x2, y2);

        // Calculate distance
        double distance = p1.distance(p2);

        // Display result
        System.out.printf("\nDistance between (%.2f, %.2f) and (%.2f, %.2f) = %.4f\n",
                x1, y1, x2, y2, distance);

        sc.close();
    }
}

