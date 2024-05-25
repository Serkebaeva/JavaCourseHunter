package Homework.Homework8;

public class StaticSums {

    public static int MultiplicationSum(int sum1, int sum2, int sum3){
        int MultiplicationResult = (sum1 * sum2* sum3);
        System.out.println("Multiplicated sum: " +MultiplicationResult);
        return MultiplicationResult;

    }

    public static void DivisionSum(double a, double b){
        System.out.println("Result of division first Sum by second: " +(a / b));
        System.out.println("The remainder from division first Sum by second: "+ (a % b) );
    }


}

class StaticSumsTest {
    public static void main(String[] args) {
        StaticSums a = new StaticSums();
        a.MultiplicationSum(1,2,3);
        a.DivisionSum(9,2);
        System.out.println("=============================================================");

        StaticSums b = new StaticSums();
        b.MultiplicationSum(2,2,2);
        b.DivisionSum(7,2);

        System.out.println("=============================================================");
        b.DivisionSum(16,3);

    }
}