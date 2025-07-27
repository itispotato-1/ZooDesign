package Lib;

public class Dolphin extends Mammal implements Swimable{

    @Override
    public String getName() {
        return "Dolphin";
    }
    @Override
    public String makeSound() {
        return "Clicking sounds";
    }
    @Override
    public String swim() {
       return "The dolphin playfully swims in the sea.";
    }
    
}
