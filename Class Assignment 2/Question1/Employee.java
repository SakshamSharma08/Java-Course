public class Employee {
    String name;
    int yearOfJoining;
    double salary;
    String address;

    // Non-parameterized constructor
    public Employee() {
        name = "";
        yearOfJoining = 0;
        salary = 0.0;
        address = "";
    }

    // Parameterized constructor
    public Employee(String name, int yearOfJoining, double salary, String address) {
        this.name = name;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
        this.address = address;
    }

    // Display method
    public void display() {
        System.out.printf("%-15s %-20d %-30s\n", name, yearOfJoining, address);
    }
}
