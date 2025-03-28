package feature3;

//public class Main {
//    public static void main(String[] args) {
//
//
//
//        Dog A1 = new Dog("A1", 5);
//        A1.makeSound();
//
//        Cat B1 = new Cat("B1", 2);
//        B1.makeSound();
//
//    }
//}



//public class Animal {
public abstract class Animal {

    private String name;
    private double age;

    public Animal (String name, double age) {
        this.name = name;
        this.age = age;}


    public void makeSound() {
        System.out.println( " издает звук ");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }


}




