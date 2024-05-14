package Lesson8;

 // "Модификаторы final и static. Понятие КОНСТАНТА"

public class Test1{
    public int a = 10;
    // 1
    // public final int a = 10; *\ если добавлю к переменной а access modifier "final",то компилятор выдаст ошибку
    // так как значение переменной станет const и далее меняться больше не может
    // java: cannot assign a value to final variable a

    // 2
    // Также при создании констаннты, мы сразу присваиваем ему значение, т.к. default ное значение у констант
    // не может равняться нулю!


    public static void main(String[] args) {
        Test1 t = new Test1();
        t.a = t.a*2;

        System.out.println(t.a);

    }
}
