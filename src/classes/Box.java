package classes;

public class Box {
    private double length;
    private double width;
    private double height;

    public Box(Box another) {
        this(another.length, another.width, another.height);
    }

    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public Box(double size) {
        this(10, 10, 10);
    }

    public Box() {
        this(10);
    }

    public void showInfo() {
        System.out.println("Width: " + width + "\nLength: " + length + "\nHeight: " + height);
    }

    public double getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
