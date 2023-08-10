package AccessModifier;

public class Car {
    int wheels; // it has default package and is accessible in this package only
    public String name; //it has public access and is available everywhere
    protected int seats; //it can be accessible through out this package and child classes
    private float price; // it is available to this class only
}
