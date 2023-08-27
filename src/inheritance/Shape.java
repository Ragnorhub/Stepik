package inheritance;

public abstract class Shape {
    private double sideA;
    private double sideB;

    public Shape(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public final double getSideA() {
        return sideA;
    }

    public final double getSideB() {
        return sideB;
    }

    public abstract double getPerimetr();
    public final void showPerimetr() {
        System.out.println(getPerimetr());
    }
}
