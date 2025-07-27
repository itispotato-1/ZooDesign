package Lib;

public class Eagle extends Bird implements Flyable{
    @Override
    public String getName() {
        return "Eagle";
    }
    @Override
    public String makeSound() {
        return "Screech!";
    }
    @Override
    public String fly() {
         return "The eagle soars through the sky.";
    }

}
