package inheritance;

public class Rectangle extends Shape{
    public Rectangle(double sideA, double sideB) {
        super(sideA, sideB);
    }

    @Override
    public double getPerimetr() {
        return getSideA()*2 + getSideB()*2;
    }
}
