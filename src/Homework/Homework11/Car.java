package Homework.Homework11;

public class Car {

    String color;
    String engine;
    int doorNumber;

    Car(String color, String engine, int doorNumber){
        this.color = color;
        this.engine = engine;
        this.doorNumber = doorNumber;
    }

    public void showInfo(){
        System.out.println("Color:  "+this.color);
        System.out.println("engine: "+this.engine);
        System.out.println("door numbers: "+ this.doorNumber);
    }
}

class CarTest {

    public static void doorNumChange(Car car1, int num){
        car1.doorNumber = num;
    }

    public static void changeColor(Car car1, Car car2){
        Car carTemp = new Car("white", null, 0);
        carTemp.color = car1.color;
        car1.color = car2.color;
        car2.color = carTemp.color;
    }



    public static void main(String[] args) {
        Car car1 = new Car("red","V4",4);
        Car car2 = new Car("black", "V6",2);

        doorNumChange(car1, 5);
   /*     System.out.println();
        System.out.println("Print of doorNumChange result: "+car1.doorNumber);*/


        changeColor(car1, car2);
        car1.showInfo();
        System.out.println();

        car2.showInfo();
        System.out.println();

/*        System.out.println();
        System.out.println("Print of car1 -> changeColor result : "+car1.color);
        System.out.println("Prinnt of car2 -> changeColor result: "+car2.color);*/
    }
}