package inheritance;

public class ColoredRectangle extends Rectangle{
    private String color;
    public ColoredRectangle(double sideA, double sideB, String color) {
        super(sideA, sideB);
        this.color = color;
    }
}
