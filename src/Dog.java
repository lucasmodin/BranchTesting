public class Dog extends Animal{

    @Override
    public void makeSound() {
        System.out.println("vuf");
    }

    @Override
    public boolean eat(String foodType) {
        return true;
    }

    @Override
    public void showMood(boolean currentMood) {
        if(currentMood) {
            System.out.println("logrer med halen");
        } else {
            System.out.println("knurrer");
        }
    }
}
