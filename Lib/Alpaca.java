package Lib;

public class Alpaca extends Mammal implements Spitting{
    @Override
    public String getName() {
        return "Alpaca";
    }
    @Override
    public String makeSound() {
        return "Mmmm";
    }
    @Override
    public String Spit() {
        return "Can spit saliva to protect themselves or express dissatisfaction.";
    }
    
}
