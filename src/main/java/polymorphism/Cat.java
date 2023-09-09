package polymorphism;

public class Cat extends Animal {

    @Override
    public void makeSound() {
        System.out.println("meow");
    }

    public void Scratch() {
        System.out.println("I am a cat. I scratch things");
    }
}
