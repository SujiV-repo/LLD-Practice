package Polymorphism_two;

public class Phone {
    int ram;
    int rom;
    String name;

    public Phone(int ram, int rom, String name){
        this.ram = ram;
        this.rom = rom;
        this.name = name;
    }

    public void phoneName(){
        System.out.println("This is a generic phone");
    }
}
