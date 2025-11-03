import java.util.Scanner;

public class EmployeeTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask for number of employees
        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        // Create array of employees
        Employee[] emp = new Employee[n];

        // Input employee details
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of Employee " + (i + 1) + ":");

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Year of Joining: ");
            int year = sc.nextInt();

            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            sc.nextLine(); // consume newline

            System.out.print("Address: ");
            String address = sc.nextLine();

            emp[i] = new Employee(name, year, salary, address);
        }

        // Display employee information in tabular form
        System.out.println("\n--------------------------------------------------------------");
        System.out.printf("%-15s %-20s %-30s\n", "Name", "Year of Joining", "Address");
        System.out.println("--------------------------------------------------------------");

        for (Employee e : emp) {
            e.display();
        }

        System.out.println("--------------------------------------------------------------");

        sc.close();
    }
}
