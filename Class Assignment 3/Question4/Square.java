// Square.java
public class Square extends Rectangle {

    // Default constructor
    public Square() {
    }

    // Constructor with side
    public Square(double side) {
        super(side, side);
    }

    // Constructor with side, color, and filled
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    // Getter and Setter for side
    public double getSide() {
        return getLength();
    }

    public void setSide(double side) {
        setLength(side);
        setWidth(side);
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public void setLength(double side) {
        super.setLength(side);
        super.setWidth(side);
    }

    // toString()
    public String toString() {
        return "Square[" + super.toString() + "]";
    }
}

