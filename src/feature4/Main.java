package feature4;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        List<Shape> shapes = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 15; i++) {
            if (random.nextBoolean()) {
                double width = 1 + random.nextDouble() * 9;
                double height = 1 + random.nextDouble() * 9;
                shapes.add(new Rectangle(width, height));
            } else {
                double radius = 1 + random.nextDouble() * 9;
                shapes.add(new Circle(radius));
            }
        }

        for (Shape shape : shapes) {
            System.out.println("Площадь " + shape.getName() + " = " + shape.calculateArea());
        }
    }}
