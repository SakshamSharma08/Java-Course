// Shape.java
public class Shape {
    private String color = "red";
    private boolean filled = true;

    // Default constructor
    public Shape() {
    }

    // Parameterized constructor
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    // Getters and Setters
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    // toString() method
    public String toString() {
        return "Shape[color=" + color + ", filled=" + filled + "]";
    }
}

