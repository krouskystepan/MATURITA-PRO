package maturita.factory;

public class AnimalFactory {

    public Animal createAnimal(String type) {
        if (type.equals("dog")) {
            return new Dog();
        }
        if (type.equals("cat")) {
            return new Cat();
        }
        return null;
    }
}
