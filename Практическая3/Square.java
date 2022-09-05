package Practice3;

import java.security.PublicKey;

public class Square extends Rectangle {
    public Square() {
        super();
    }

    public Square(double side) {
        width = side;
        length = side;
    }

    public Square(double side, String color, boolean filled) {
        width = side;
        length = side;
        this.color = color;
        this.filled = filled;
    }

    public double getSide() {
        return width;
    }

    public void setSide(double side) {
        width = side;
        length = side;
    }

    @Override
    public void setLength(double side) {
        setLength(side);
    }

    @Override
    public void setWidth(double side) {
        setWidth(side);
    }

    @Override
    public String toString() {
        return "Square:\nSide - " + width + ", color -" + color + ", filled - " + isFilled();
    }
}
