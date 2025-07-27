package Lib;

public abstract class animal {
    private final String name;
    public animal(){
        name = getName();
    }
    public String getName(){
        return this.name;
    }
    public abstract String makeSound();
}
