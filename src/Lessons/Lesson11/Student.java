package Lessons.Lesson11;
// REFERENCE DATA TYPES
public class Student {
   public String name;
    public int course;
    public int grade;

    public Student (String name, int course, int grade) {
        this.name = name;
        this.course = course;
        this.grade = grade;
    }

    public static void swap(Student s1, Student s2){
        Student s3 = s1;
        s1 = s2;
        s2 = s3;
        System.out.println("Print vnutri metoda SWAP: "+s1.name);
    }

    public static void changeName(Student s1){
        s1.name = "Vasiliy";
    }

    public static void main(String[] args){
        Student st1 = new Student("Ivan", 3, 9);
        Student st2 = new Student("Petr", 1,5);
        swap(st1, st2);
        System.out.println("Print vnutri MAIN: "+st1.name);

        Student st4 = new Student("Oleg", 5, 7);
        changeName(st4);
        System.out.println(st4.name);
    }

/*    Pochemu vnutri metoda MAIN SWAP metod ne srabotal? Est' pravilo:
*     Когда в параметр метода подставляется REFERENCE DATA TYPES в параметр на самом деле подставляются копии этих
*     REFERENCE DATA TYPES....
*
*     !!!! Но, с помощъю копий REFERENCE DATA TYPE, мы можем менять какие-либо элементы объекта... Пр: метод CHANGE NAME,
*      мы поменяли имя с пом.копии объекта, но сам объект(и его reference, адрес) не поменялось...
* */
}
