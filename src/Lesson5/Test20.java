package Lesson5;

 // Sozdanie obektov. Ponyatie Construktor. Obyavlenie i vyzov metodov.

public class Test20 {

    int summa (int a, int b, int c) {
        int result = a+b+c;
        return result;
    }

    int sredneeArifm (int a1, int b1, int c1) {
        int result2 = summa(a1, b1, c1)/3;
        return result2;
    }
}

// Vyzov metoda

class Test21 {
    public static void main(String[] args) {
        Test20 t = new Test20();
        int summaTrehChisel = t.summa(1,2,3);
        System.out.println("summaTrehChisel = "+summaTrehChisel);
        System.out.println("sredneeArifm = " +t.sredneeArifm(1,2,3));
    }
}
