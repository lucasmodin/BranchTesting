public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.makeSound();
        cat.makeSound();

        dog.eat("Oskar");
        cat.eat("Rasmus");
    }
}
