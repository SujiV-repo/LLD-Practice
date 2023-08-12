package PolyMorphism;

public class Vehicle {
    int seats;
    String name;
    private double price;

    public Vehicle(int seats, String name, double price) {
        this.seats = seats;
        this.name = name;
        this.price = price;
    }

     void getPrice(){
        System.out.println("I am trying to print a private attribute using a private method" + this.price);
    }
}
