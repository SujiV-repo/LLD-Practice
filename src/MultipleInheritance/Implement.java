package MultipleInheritance;

public class Implement implements firstInterface, secondIn{
    //the both interfaces have same method to implement in this class but when we defined the
    //method once the compiler will not ask to define the method twice even though it has
    //two interfaces and same method it will only have one implementation for a class therefore avoiding ambiguity
    @Override
    public void getResponse() {
        System.out.println("this is the class");
    }
}
