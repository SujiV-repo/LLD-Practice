package JavaCollections;

    public interface TestInterface {
    //Trying to declare a variable with a value
    //In Java Interfaces, we have declared variables with all the values but they are implicitly
    //treated as constants.
    int num = 10;
    //As you can see below, without initialization java compiler is throwing an error
    //You can't force a class to have a variable, but with an interface you can force it to have a method.
    //int number;
    //Any fields/variables on the interfaces are automatically treated as public static final

    int abstractMethod();

    //Default methods are used to provide the default implementation in an interface that can be used in
        // a class or can override with other implementation in the class
    default void defaultMethod(){
        System.out.println("we can execute code in the interfaces :)");
    }

    //We can declare static methods to use the methods as a utility class
}
