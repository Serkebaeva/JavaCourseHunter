package Homework.Homework10.p4;

 import Homework.Homework10.p1.A;
 import Homework.Homework10.p1.p2.p3.C;
 import Homework.Homework10.p4.p5.E;
 import static Homework.Homework10.p1.p2.B.*;

public class D {

 public static double sum(double e2){
  E obj1 = new E();
  double obj = (obj1.e1*e2);
  return obj;
 }


 public static void main(String[] args) {
  A intA1 = new A();
  int x = intA1.a1;
  System.out.println();
  System.out.println("NON_STATIC int a1 imported into STATIC MAIN in D class from A class and equals to: "+x);
  System.out.println("NON_STATIC double e1 variable imported into STATIC MAIN method in D class from E class and equals to: "+ sum(2));
  C c2 = new C();
  System.out.println("NON_STATIC String c1 imported into STATIC MAIN in D class from C class and it appears to be: "+ c2.c1);
  System.out.println("STATIC int variables b1 & b2 imported into STATIC MAIN method to D class from B class and their sum equals to: "+(b1+b2));
 }
}
