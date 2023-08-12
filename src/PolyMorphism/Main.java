package PolyMorphism;

public class Main {
    public static void main(String[] args) {
        // Creating a parent class named Vehicle and a child class Car
        //Finding out which attributes of class can be seen and can be inherited to child class
        //checking the values especially for private attributes
        //made price and getPrice members as private and creating the child object
        Car car = new Car(4,"volvo", 9567888.00);

        System.out.println(car.seats);
        //System.out.println(car.price); -> The car object does contain all the three attributes including
        //private variable but the child object accessing the variable entirely depends upon access modifier
        //trying to access method with child object
        //car.getPrice(); -> the car attribute doesn't able to access the private method and throwing errors

        /*Vehicle vehicle = new Vehicle(6, "Toyoto", 596880.26);
        System.out.println(vehicle.name);
        System.out.println(vehicle.price);*/
        //even though we created a parent object in other class private is only for the same class
        //creating objects in other class for parent class might not help with accessing the private attributes and we will get errors

        //Let us try having a final keyword for parent class
        //The class cannot be extended or inherited if we use a final in the class declaration
        //The method cannot be overridden if we use final in the method declaration
        //In context of variables if we declare a variable as final we cannot change the values

        //Using sealed class
        //sealed class is a generalization of a final class.
        // A sealed class restricts which other classes or interfaces may extend or implement them.
        // This means that only the classes or interfaces explicitly listed in the permits clause
        // of the sealed class can extend or implement it.
        // In contrast, a final class cannot be extended by any class1.

        //Polymorphism has two type -> runtime and compile time
        //method overloading is for compile time as it can have same method name but with different method signatures
        // creating a method name get price as per seats

    }
}
