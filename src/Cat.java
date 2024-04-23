public class Cat extends Animal{
    @Override
    public void makeSound() {
        System.out.println("miav");
    }

    @Override
    public boolean eat(String foodType) {
        return true;
    }

    @Override
    public void showMood(boolean currentMood) {
        if (currentMood) {
            System.out.println("spinder");
        } else {
            System.out.println("hvæser");
        }
    }
}
