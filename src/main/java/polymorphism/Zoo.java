package polymorphism;

public class Zoo {

    public static void main(String[] args) {

        Dog rocky = new Dog();
        rocky.fetch();
        rocky.makeSound();
        feed(rocky);

        Animal sasha = new Dog();
        sasha.makeSound();

        sasha = new Cat();
        sasha.makeSound();
        ((Cat)sasha).Scratch();
        boolean inAnimal = sasha instanceof Cat;
        System.out.println(inAnimal);
        feed(sasha);


        Animal pasha = new Dog();
        if (pasha instanceof Dog pashaTheDog){
            pashaTheDog.fetch();
        }

        //same as above
        if(pasha instanceof Dog){
            Dog pashaTheDog = (Dog) pasha;
            pashaTheDog.fetch();
        }
    }

    public static void feed(Animal animal){
        if (animal instanceof Dog){
            System.out.println("here's your dog food");
        } else if (animal instanceof Cat) {
            System.out.println("here's your cat food");
        }
    }
}
