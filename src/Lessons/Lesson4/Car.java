package Lessons.Lesson4;

public class Car {
    String color = "red"; // "red" will be used by default...
    String engine = "V6"; // will be used by default...
}

class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.color = "black";
        car1.engine = "V8";

        System.out.println(car1.color);
        System.out.println(car1.engine);
    }
}
