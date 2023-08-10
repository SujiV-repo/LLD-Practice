package AccessModifier;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        Car c = new Car(); // even though I have not written any constructor I have created a car object
        System.out.println("Current car name is :"+ c.name); // values will be default if we invoke default constructor
        c.name = "TATA"; // name is a public attribute and I am able to access the value for the object
        System.out.println("Current car name is :"+ c.name);
        System.out.println("Current car seats before assigning :"+c.seats);
        c.seats = 4;   //seats it is protected, this package and its child can access the seats
        System.out.println("Current car seats :" + c.seats);

        c.wheels = 4; // wheels are default access modifier, available through out this package
        System.out.println("Current car wheels :"+ c.wheels);

        //c.price = 150000; -> will throw compile time error as I am trying to access the private variable
        //System.out.println("The price of car is :"+c.price); //here I am trying to access the private datamember of a class

        //encapsulation is achieved by binding the classes and objects
        //we call a constructor by using new keyword, which will create the objects
        //we can see all the attributes including the private attributes in the object
        //As we are outside the class we can't access the private access modifier
    }
}