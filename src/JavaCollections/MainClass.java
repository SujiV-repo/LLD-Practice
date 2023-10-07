package JavaCollections;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class MainClass {
    List<Integer> arr = new ArrayList<>();
    ArrayList<Integer> array = new ArrayList<>();
    public static void main(String[] args) {
        MainClass mainClass = new MainClass();
        mainClass.calculateList();
        mainClass.calculateArrayList();
    }

    public void calculateList(){
        long start = System.nanoTime();
        for(int i = 0; i < 10000; i++){
            arr.add(i);
        }
        long end = System.nanoTime();
        System.out.println(end - start);
    }

    public void calculateArrayList(){
        long start = System.nanoTime();
        for(int i = 0; i < 10000; i++){
            array.add(i);
        }
        long end = System.nanoTime();
        System.out.println(end - start);
    }


}
//By this I got to know that implementing through interface takes more time than the concrete implementation
//for example in the above code, I have declared the ArrayList through List interface and concrete implementation
//for the list interface, it took around 874601 nanoseconds to add all the 10k numbers
//but the concrete implementation only took 491201 nanoseconds to add all the 10k number
//Using List reference variable, suppose to add an element at the end of the list takes more time because
//due to lack of the direct access to the internal array