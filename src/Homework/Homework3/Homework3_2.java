package Homework.Homework3;

public class Homework3_2 {

    public static void main(String[] args) {
        int a=5;
        //      4       3    4     5   5
        //      5       3    4     4   5 = 15
        int d = a-- - --a + ++a + a++ +a;

        System.out.println(d);

        int b=8;
        //     9     10    11    10
        //     9     9     11    10 = 1
        int c=++b - b++ + ++b - --b;

        System.out.println(c);
    }

}
