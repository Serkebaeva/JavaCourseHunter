package Homework.Homework9;

public class Test3 {

    int a = 1;
    static int b = 2;

    void abc(int a){
        System.out.println(b);
        System.out.println(a); // 4
        System.out.println(this.a); // 1
        System.out.println(Test3.b);
    }

    public static void main(String[] args){
        Test3 t = new Test3();
        t.abc(4);
    }
}
