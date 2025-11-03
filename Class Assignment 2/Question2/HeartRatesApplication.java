import java.util.Scanner;

public class HeartRatesApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HeartRates[] persons = new HeartRates[2];

        // Input for two persons
        for (int i = 0; i < 2; i++) {
            System.out.println("\nEnter details for Person " + (i + 1) + ":");
            System.out.print("First Name: ");
            String firstName = sc.nextLine();

            System.out.print("Last Name: ");
            String lastName = sc.nextLine();

            System.out.print("Day of Birth (1-31): ");
            int day = sc.nextInt();
            System.out.print("Month of Birth (1-12): ");
            int month = sc.nextInt();
            System.out.print("Year of Birth: ");
            int year = sc.nextInt();
            sc.nextLine(); // consume newline

            // Create DateOfBirth and HeartRates objects
            DateOfBirth dob = new DateOfBirth(day, month, year);
            persons[i] = new HeartRates(firstName, lastName, dob);
        }

        // Display output in tabular format
        System.out.println("\n---------------------------------------------------------------------------------------");
        System.out.printf("%-12s %-12s %-12s %-8s %-10s %-20s\n",
                "First Name", "Last Name", "Date of Birth", "Age", "Max HR", "Target HR Range");
        System.out.println("---------------------------------------------------------------------------------------");

        for (HeartRates person : persons) {
            person.display();
        }

        System.out.println("---------------------------------------------------------------------------------------");

        sc.close();
    }
}

