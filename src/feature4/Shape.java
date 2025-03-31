package feature4;

//public class Main {
//    public static void main(String[] args) {
//
//        Shape rectangle = new Rectangle(10.5, 10);
//        Shape circle = new Circle(10);
//
//
//        System.out.println("Площадь прямоугольника = " + rectangle.calculateArea());
//        System.out.println("Площадь круга = " + circle.calculateArea());
//    }
//}
//в последнем задании, в тестировании сделай следующее:
//
//создай List, в цикле рандомно добавь 15 фигур;
//в цикле по листу выведи подобным образом - System.out.println("Площадь прямоугольника = " + rectangle.calculateArea());в последнем задании, в тестировании сделай следующее:
//
//создай List, в цикле рандомно добавь 15 фигур;
//в цикле по листу выведи подобным образом - System.out.println("Площадь прямоугольника = " + rectangle.calculateArea());

public interface Shape {
    String getName();
    double calculateArea ();}
