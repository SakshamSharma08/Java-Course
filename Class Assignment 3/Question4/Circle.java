// Circle.java
public class Circle extends Shape {
    private double radius = 1.0;

    // Default constructor
    public Circle() {
    }

    // Constructor with radius
    public Circle(double radius) {
        this.radius = radius;
    }

    // Constructor with radius, color, and filled
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    // Getter and Setter
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Area and Perimeter
    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    // toString()
    public String toString() {
        return "Circle[" + super.toString() + ", radius=" + radius + "]";
    }
}

