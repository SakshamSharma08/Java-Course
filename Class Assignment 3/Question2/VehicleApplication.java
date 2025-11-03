// VehicleApplication.java
import java.util.Scanner;

public class VehicleApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of tyres: ");
        int N = sc.nextInt();

        Vehicle vehicle;  // reference of base class

        switch (N) {
            case 2:
                vehicle = new Bike();
                break;
            case 4:
                vehicle = new Car();
                break;
            default:
                vehicle = new Vehicle();
                break;
        }

        // Display the message
        vehicle.display();

        sc.close();
    }
}

