package Homework.Homework9;

public class garbageCollector {
    int a;
    static int counter;
    void showInfo(){
        System.out.println("Object #"+ counter + " equals to: "+a);
    }

}

class garbageCollectorTest{
    public static void main(String[] args) {
        garbageCollector someObject1 = new garbageCollector();
        someObject1.a = 1;
        garbageCollector.counter++;
        someObject1.showInfo();

        garbageCollector someObject2 = new garbageCollector();
        someObject2.a = 3;
        garbageCollector.counter++;
        someObject2.showInfo();

        garbageCollector someObject3 = new garbageCollector();
        someObject3 = null;
        garbageCollector.counter++;
        someObject3.showInfo();

        garbageCollector someObject4 = new garbageCollector();
        someObject4 = someObject3;
        garbageCollector.counter++;
        someObject4.showInfo();

        /// i tak dalee otnositel'no ostal'nyh ob'ektov.....

    }
}
