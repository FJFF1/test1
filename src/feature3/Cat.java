public class Cat extends Animal {
    public Cat(String name, double age) {
        super(name, age);
    }

    //  public void meow (){
    @Override
    public void makeSound () {
        System.out.println("мяу!");

        //}
    }
}
