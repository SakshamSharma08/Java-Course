// Distance.java
public class Distance {
    private float feet;
    private float inch;

    // Non-parameterized constructor
    public Distance() {
        this.feet = 0;
        this.inch = 0;
    }

    // Parameterized constructor
    public Distance(float feet, float inch) {
        this.feet = feet;
        this.inch = inch;
        normalize();
    }

    // Getter methods
    public float getFeet() {
        return feet;
    }

    public float getInch() {
        return inch;
    }

    // Setter methods
    public void setFeet(float feet) {
        this.feet = feet;
    }

    public void setInch(float inch) {
        this.inch = inch;
        normalize();
    }

    // Overloaded setter (set both feet and inches together)
    public void setDistance(float feet, float inch) {
        this.feet = feet;
        this.inch = inch;
        normalize();
    }

    // Method to normalize inches (convert extra inches into feet)
    private void normalize() {
        if (inch >= 12) {
            feet += (int)(inch / 12);
            inch = inch % 12;
        }
    }

    // Method to calculate and display sum of two distances
    public void sum(Distance d2) {
        float totalFeet = this.feet + d2.feet;
        float totalInch = this.inch + d2.inch;

        // Normalize inches to feet
        if (totalInch >= 12) {
            totalFeet += (int)(totalInch / 12);
            totalInch = totalInch % 12;
        }

        System.out.println("\nSum of Distances:");
        System.out.println("Feet: " + totalFeet + " | Inches: " + totalInch);
    }
}
