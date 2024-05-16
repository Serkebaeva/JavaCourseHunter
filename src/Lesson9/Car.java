package Lesson9;

public class Car {
    static String color;
    static String engine;
    static int count;

    Car (String color2, String engine2) {
        count++;
        color = color2;
        engine = engine2;
        System.out.println("The car #" +count+ " is created, color of the car is - "+color + ", engine is - "+engine);

    }

    public static void showColor(){
        System.out.println("Color of the car "+color);
    }

    public static void changeColor(String color3) {
        int cena = 5000;
        color = color3;
        cena += 1000;
        System.out.println("Color of the car is changed! " + color + " New price is - " +cena);

    }
    public static void main(String[] args) {
        Car car1 = new Car("red", "v6");
        showColor();
        changeColor("black");
    }
}
