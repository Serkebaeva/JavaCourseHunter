package Lesson6;

/*public class methodOverloading {
    void showInt(int i1) {
        System.out.println(i1);
    }

    void showBoolean(boolean b1){
        System.out.println(b1);
    }

    void showString(String s1){
        System.out.println(s1);
    }
}

class methodOverloadingTest{
    public static void main(String[] args) {
        methodOverloading mO = new methodOverloading();
        int a = 500;
        mO.showInt(a);

        boolean b = true;
        mO.showBoolean(b);

        String s1 = "privet";
        mO.showString(s1);

    }
}*/

/*
Перегрузка методов(Method Overloading) - создание методов с одинаковым именем, но с разными параметрами.
 т.е. Overloading позволяет нам такие вот методы (showInt, showString, showBoolean- похожие по функциональности,
но разные по параметрам/по типам данных) называть одним именем: show, и результат от этого не поменяется,
 т.к. результат зависит от введенных нами типов данных(параметров), example follows...

*/

public class methodOverloading {
    void show(int i1) {
        System.out.println(i1);
    }

    void show(boolean b1){
        System.out.println(b1);
    }

    void show(String s1){
        System.out.println(s1);
    }
}

class methodOverloadingTest{
    public static void main(String[] args) {
        methodOverloading mO = new methodOverloading();
        int a = 500;
        mO.show(a);

        boolean b = true;
        mO.show(b);

        String s1 = "privet";
        mO.show(s1);

    }
}