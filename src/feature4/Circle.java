package feature4;

public class Circle implements Shape {
    private double radius;
    public Circle (double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String getName() {
        return "круга";
    }
}