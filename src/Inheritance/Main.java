package Inheritance;

public class Main {
    public static void main(String[] args) {
        //for scenario which i didn't add anything in the child class not even a single data member
        //just extending the class with the bike class

        ICEBike bike = new ICEBike(50000, "Harley Davidson", 5);
        //System.out.println(bike.price);
        //Nothing written in the Icebike class and yet I am able to create objects by using the child class
        //even though no constructor is there in either of the classes, the default is invoked and all the values are set to their default

        //Adding parameterized constructor in parent without adding any code in the child
        //After adding the constructor in parent, it is throwing a compile time error
        //to add a child constructor and pass the parameters through super()
        //so adding the constructor in child class

        System.out.println("Bike Price :" + bike.price +" Name :"+bike.name+" Gears :"+bike.gears);
        //All the arguments that I have passed does contain the data in the object and able to print it

        //Now adding a private constructor to the parent class with only two attributes, name and price
        //both the variables have default access modifier but the constructor is private

        /*Bike bike1 = new Bike(200000, "jawa");
        System.out.println(bike1.name);*/

        //I am getting compile time error with reason Bike(int,java.lang.String) has private access in Inheritance.Bike
        //proceeding with 3 parameters and internally I have used constructor telescoping to invoke the private constructor
        //so if we pass three parameters to constructor, two of them will be using private constructor internally

        Bike bike1 = new Bike(60000, "Yamaha", 5);
        System.out.println(bike1.name);
        //if we can call the public constructor and internally we can use the private constructor
        //we can pass it through constructor chaining.

        //Creating a child constructor and passing only two values to try to invoke the private constructor of parent
        /*ICEBike bike2 = new ICEBike(680000, "ducati");
        System.out.println(bike2.name);*/
        //It is giving compiler error as it should have three attributes
        //we cannot pass into the private constructor even though it is the child class

        //now I made two parameters constructor as public, but still without passing
        //super(price,  name) in child constructor we cannot create objects
        ICEBike bike2 = new ICEBike(630000, "Ktm");
        System.out.println(bike2.price + " " + bike2.name);
        //the compile time errors are gone when I created a new constructor in child class
        //and passed these two arguments to super()

        //Now I made price attribute as private in the bike class
        ICEBike bike3 = new ICEBike(400000, "Duke", 5);
        System.out.println(bike3.price + " " + bike3.gears + " "+ bike3.name);
        //After creating the child object we will have each and every attribute of parent in the child object
        //but depending upon the access modifier we will be have the access to the methods or variables for the child
    }
}
