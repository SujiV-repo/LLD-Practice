package Polymorphism_two;
import java.lang.Object;
public class Main {
    public static void main(String[] args) {
        Phone phone = new Iphone(4, 64, "phone 13");
        Iphone p1 = new Iphone(6,128, "Iphone14");
        System.out.println(phone.ram);
        System.out.println(phone.name);
        phone.phoneName();
        //phone.specialFeature(); -> in upcasting tried to call a method which is not there in parent but in child it is present, it will throw the error as the parent ref variable cannot get the extra attributes of child which are not there in parent
        p1.specialFeature();
    }
}


