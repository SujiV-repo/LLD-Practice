package Inheritance;

public class ICEBike extends Bike{
    public ICEBike(int price, String name, int gears) {
        super(price, name, gears);
        //super(price, name);
        //even though I tried to add the constructor with two variables, because it is private and super
        //will be giving a compiler error
    }

    public ICEBike(int price, String ktm) {
        super(price, ktm);
    }

    @Override
    public void getBikeInfo() {
        System.out.println("I am using Ice bike");
    }
}
