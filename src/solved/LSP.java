package solved;

public class LSP {
}

// Liskov Substitution Principle solution: we are going to redesign the hierarchy to better represent
// the relationship between the classes and without violating the function of the methods.
// We are going to use an interface called Shape this time; in which both Square and Rectangle will implement

// The setWidth and setHeight methods are no longer overridden in Square,
// ensuring consistent behavior across shapes in the hierarchy.


// Shape interface representing a geometric shape
interface Shape {
    int getArea();
}

// Rectangle class implementing the Shape interface
class Rectangle implements Shape {
    protected int width;
    protected int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public int getArea() {
        return width * height;
    }
}

// Square class implementing the Shape interface
class Square implements Shape {
    private int sideLength;

    public Square(int sideLength) {
        this.sideLength = sideLength;
    }

    public int getSideLength() {
        return sideLength;
    }

    public void setSideLength(int sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public int getArea() {
        return sideLength * sideLength;
    }
}

