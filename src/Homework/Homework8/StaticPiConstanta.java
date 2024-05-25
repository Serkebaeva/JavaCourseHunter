package Homework.Homework8;

public class StaticPiConstanta {
    static final double piConst = 3.14;
    double radius;

    public double getCircleAreaValue(double r){
        radius = r;
        double circleArea = piConst * radius * radius;
        /*The area of a circle is equal to Pi π times the radius r squared.
        π * (radius)2
        */
        /*System.out.println("Area of " + r + " radius Circle is: " + circleArea);*/
        return circleArea;
    }

    public static double getCircleCircumferenceValue(double r){
        double CircumferenceValue = 2*piConst*(r);
                                      //C=2πr
       /* System.out.println("Circumference of " + r + " radius Circle is: " + CircumferenceValue);*/
        return CircumferenceValue;
    }

    public void showInfo(double r){
        radius = r;
        System.out.println("Radius of Circle is: " + radius);

        StaticPiConstanta circle1 = new StaticPiConstanta();
        double circleArea1 = circle1.getCircleAreaValue(radius);
        System.out.println("Area of " + radius + " radius Circle is: " + circleArea1);

        double CircumferenceValue1 = circle1.getCircleCircumferenceValue(radius);
        System.out.println("Circumference of " + radius + " radius Circle is: " + CircumferenceValue1);
    }

}

class StaticPiConstantaTest{
    public static void main(String[] args) {
        StaticPiConstanta circle8 = new StaticPiConstanta();
  /*      circle8.getCircleAreaValue(8);
        getCircleCircumferenceValue(8);*/
        circle8.showInfo(8);
    }

}
