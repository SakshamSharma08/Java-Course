// Point.java
public class Point {
    // Private data members
    private double x;
    private double y;

    // Non-parameterized constructor
    public Point() {
        this.x = 0.0;
        this.y = 0.0;
    }

    // Constructor with one argument (sets x coordinate, y = 0)
    public Point(double x) {
        this.x = x;
        this.y = 0.0;
    }

    // Constructor with two arguments (sets both coordinates)
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Getter for x
    public double getX() {
        return x;
    }

    // Setter for x
    public void setX(double x) {
        this.x = x;
    }

    // Getter for y
    public double getY() {
        return y;
    }

    // Setter for y
    public void setY(double y) {
        this.y = y;
    }

    // Function to calculate distance between two points
    public double distance(Point otherPoint) {
        double dx = this.x - otherPoint.x;
        double dy = this.y - otherPoint.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
}

