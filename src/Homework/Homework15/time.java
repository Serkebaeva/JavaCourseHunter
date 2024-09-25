package Homework.Homework15;

public class time {

    public static void showTime() {
        int chas = 0;
        OUTER:
        while (chas < 6) {
            chas++;

            int minuta = 0;

            MIDDLE:
            do {
                minuta++;

                if (chas > 1 && minuta % 10 == 0) {
                    break OUTER;
                }


                int sekunda = 0;
                INNER:
                while (sekunda <= 59) {
                    sekunda++;

                    if (sekunda * chas > minuta) {
                        continue MIDDLE;
                    }
                    System.out.println(chas + " : " + minuta + " : " + sekunda);
                }
            } while (minuta <= 59);


        }
    }

    public static void main (String[]args){
        showTime();
    }
}





