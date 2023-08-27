package inheritance;

public class Triangle extends Shape{
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        super(sideA, sideB);
        this.sideC = sideC;
    }

    @Override
    public double getPerimetr() {
        return getSideA() + getSideB() + sideC;
    }
}
