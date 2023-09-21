package Polymorphism_two;

public class Iphone extends Phone{
    String osVersion;
    Iphone(int ram, int rom, String name){
        super(ram, rom, name);
    }

    public void phoneName(){
        System.out.println("This is an iphone");
    }

    public void specialFeature(){
        System.out.println("Iphones special features");
    }
}
