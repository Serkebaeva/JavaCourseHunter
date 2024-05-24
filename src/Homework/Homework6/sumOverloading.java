package Homework.Homework6;

public class sumOverloading {
    int sum(int i1, int i2){
        return i1+i2;
    }

    int sum() {
        return 0;
    }

    int sum(int i1){
        return this.sum(i1, 0);
    }

    int sum(int i1, int i2, int i3, int i4){
        return i1+i2+i3+i4;
    }

    int sum(int i1, int i2, int i3){
        return this.sum(i1,i2,i3, 0);
    }

}


class sumOverloadingTest{
    public static void main(String[] args) {
        sumOverloading sum1 = new sumOverloading();
        int a = sum1.sum();
        int b = sum1.sum(1,2);
        int c = sum1.sum(1,2,3);
        int d = sum1.sum(1,2,3,4);
        int f = sum1.sum(5);

        System.out.println(a);
        System.out.println("Summa iz dvuh chisel = "+b);
        System.out.println("Summa iz treh chisel = "+c);
        System.out.println("Summa iz chetyreh chisel = "+d);
        System.out.println("Summa iz odnogo chisla = "+f);
    }
}