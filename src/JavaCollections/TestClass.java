package JavaCollections;

public class TestClass implements TestInterface{
    public static void main(String[] args) {
        // Trying to get the variable that I declared in the interface

        System.out.println(TestInterface.num);
        // As the num variable is public static final, we can use interface name and access that variable
        //as it is declared final implicitly we cannot change the value of the num
        //Ex: TestInterface.num = 15; - > I tried declaring this and it is showing error as cannot declare as variable is final


    }

    @Override
    public int abstractMethod() {
        return 0;
    }


}
