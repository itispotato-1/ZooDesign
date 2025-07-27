package Lib;

public class Penguin extends Bird implements Swimable{

    @Override
    public String getName() {
        return "Penguin";
    }
    @Override
    public String makeSound() {
        return "Squawk!";
    }
    @Override
    public String swim() {
        return "The penguin dives gracefully in the water.";
    }
     
}
