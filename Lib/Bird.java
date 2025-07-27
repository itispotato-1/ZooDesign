package Lib;

public class Bird extends animal{
    @Override
    public String getName() {
        return "Bird";
    }
    @Override
    public String makeSound() {
        return "Bird chirp";
    }
    
}
