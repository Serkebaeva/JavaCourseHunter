package Lesson8;

public class Test2 {

    public final int a;

    Test2(){
        a = 10;
    }

    Test2(boolean b){
        a = 15;
    }

    public static void main(String[] args) {
        Test2 t = new Test2(true);
        //Test2 t = new Test2();

        /*
       Вы сможете использовать Instance variables только с пом.уже созданного объекта, т.е. по любому нужно
       сначала обратиться к конструктору:
       1) Если обЪект создастся с пом.Test2() то a будет = 10.
       2) Если с пом.второго конструктора то а будет = 15.

       ! Но, в любом случае эта константа а 1 раз примет свое значение и больше меняться не будет...
        */

        System.out.println(t.a);
    }
}
