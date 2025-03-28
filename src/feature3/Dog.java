package feature3;

public class Dog extends Animal {
    public Dog(String name, double age) {
        super(name, age);
    }

    //  public void bark() {
    @Override
    public void makeSound () {
        System.out.println("гав-гав!");
    }
//}
}

