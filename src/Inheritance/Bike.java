package Inheritance;

public class Bike {
    int price;
    String name;
    int gears;

    public Bike(int price, String name, int gears) {
        this(price, name);
        this.gears = gears;
    }

    public Bike(int price, String name){
        this.price = price;
        this.name = name;
    }
}
