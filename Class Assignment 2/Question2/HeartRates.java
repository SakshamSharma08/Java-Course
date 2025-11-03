import java.time.LocalDate;
import java.time.Period;

class DateOfBirth {
    private int day;
    private int month;
    private int year;

    // Constructor with validation
    public DateOfBirth(int day, int month, int year) {
        if (month < 1 || month > 12) {
            throw new IllegalArgumentException("Invalid month!");
        }
        if (day < 1 || day > 31) {
            throw new IllegalArgumentException("Invalid day!");
        }
        if (year > LocalDate.now().getYear()) {
            throw new IllegalArgumentException("Year cannot be in the future!");
        }
        this.day = day;
        this.month = month;
        this.year = year;
    }

    // Getters
    public int getDay() { return day; }
    public int getMonth() { return month; }
    public int getYear() { return year; }

    // Returns date in DD/MM/YYYY format
    public String getFullDate() {
        return day + "/" + month + "/" + year;
    }
}

public class HeartRates {
    private String firstName;
    private String lastName;
    private DateOfBirth dob;

    // Constructor
    public HeartRates(String firstName, String lastName, DateOfBirth dob) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
    }

    // Getters and setters
    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public DateOfBirth getDob() { return dob; }
    public void setDob(DateOfBirth dob) { this.dob = dob; }

    // a) Calculate age
    public int calculateAge() {
        LocalDate birthDate = LocalDate.of(dob.getYear(), dob.getMonth(), dob.getDay());
        LocalDate currentDate = LocalDate.now();
        return Period.between(birthDate, currentDate).getYears();
    }

    // b) Calculate maximum heart rate
    public int calculateMaxHeartRate() {
        return 220 - calculateAge();
    }

    // c) Calculate target heart rate range (50%–85%)
    public String calculateTargetHeartRate() {
        int maxRate = calculateMaxHeartRate();
        double lower = maxRate * 0.5;
        double upper = maxRate * 0.85;
        return String.format("%.1f - %.1f bpm", lower, upper);
    }

    // Display information in table format
    public void display() {
        System.out.printf("%-12s %-12s %-12s %-8d %-10d %-20s\n",
                firstName, lastName, dob.getFullDate(), calculateAge(),
                calculateMaxHeartRate(), calculateTargetHeartRate());
    }
}
