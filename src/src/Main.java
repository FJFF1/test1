package src;

public class Main {



    public static void main(String[] args) {
        Car car1 = new Car("audi", "F123", 1999);
        System.out.println("Первая машина" + " " +car1.getBrand() + " " + car1.getModel());
       /* car1.brand = "audi";
        car1.model = "F123";
        car1.year = 1999;*/

       /* Car car2 = new Car();
        car2.brand = "bmw";
        car2.model = "M3";
        car2.year = 2002;

        car1.displayInfo();*/


    }
}