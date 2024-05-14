package Homework.Homework3;
    public class Homework3_1 {
        public static void main(String[] args) {
            int i1 = 5;
            int i2 = 11;
            double d1 = 5.5;
            double d2 = 1.3;
            long l = 20L;
            double result = 0;

            result = ((i2 / d1) + (d2 % i1)) - l;

            //         11/5.5        1.3%5     -20 = -16,9
            //           2      +     1,1      -20 = -16,7

            System.out.println(result);
        }

    }