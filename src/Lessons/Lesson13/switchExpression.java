package Lessons.Lesson13;

import Lessons.Lesson11.*;

public class switchExpression {
   /*public static void main(String[] args) {
        Student st1 = new Student("Ivan", 3, 2);
//        st1.grade = 3;
       switch(st1.grade){
           case 2:
               System.out.println("Student dvoichnik");
               break;
           case 3:
               System.out.println("Student troichnik");
               break;
           case 4:
               System.out.println("Student horoshist");
               break;
           case 5:
               System.out.println("Student otlichnik");
               break;

           default:
               System.out.println("Ocenka neverna!");
       }
    }*/

    public static void main(String[] args) {
String s1 = "subota";

        switch (s1) {
            case "ponedelnik":
            case "Vtornik":
            case "sreda":
            case "chetverg":
            case "piatnica":
                System.out.println("Rabotaem s 9AM - 6PM");
                break;
            case "subota":
            case "voskresenie":
                System.out.println("Vyhodnye");
                break;
        }
    }
}
