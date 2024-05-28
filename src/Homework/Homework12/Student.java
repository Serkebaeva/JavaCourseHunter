package Homework.Homework12;

public class Student {
    String name;
    int course;
    double grade;

    Student (String name, int course, double grade) {
        this.name = name;
        this.course = course;
        this.grade = grade;
    }

    public static void swap(Student s1, Student s2){
        Student s3 = s1;
        s1 = s2;
        s2 = s3;
//        System.out.println("Print vnutri metoda SWAP: "+s1.name);
    }

    public static void changeName(Student s1){
        s1.name = "Vasiliy";
    }

}

class StudentTest {

    public static void areEquals(Student s1, Student s2){
        if (s1.name.equals(s2.name) && s1.course == (s2.course) && s1.grade== (s2.grade)) {
            System.out.println("Object "+s1.name + " equals to Object "+ s2.name);
        } else {
        System.out.println("Objects are not equal!");
        }
    }

    public static void differenceBetween(Student s1, Student s2) {

        if (s1.name.equals(s2.name) && s1.grade == s2.grade && s1.course == s2.course) {
            System.out.println("Objects are equal in all 3 attributes!");

        } else {

            if (s1.name.equals(s2.name) && s1.grade == s2.grade && s1.course != s2.course) {
                System.out.println("Objects differs with course attribute: " + s1.course + " " + s2.course);

            } else if (!s1.name.equals(s2.name) && s1.grade == s2.grade && s1.course == s2.course) {
                System.out.println("Objects differs with name attribute: " + s1.name + " & " + s2.name);

            } else if (s1.name.equals(s2.name) && s1.grade != s2.grade && s1.course == s2.course) {
                System.out.println("Objects differs with grade attribute: " + s1.grade + " & " + s2.grade);

            } else if (s1.name.equals(s2.name) && s1.grade != s2.grade && s1.course != s2.course) {
                System.out.println("Objects are equal with only name attribute and differs with rest 2: grade(" + s1.grade + " & " + s2.grade +"); " + "course(" + s1.course + " & " + s2.course + ");");

            } else if (!s1.name.equals(s2.name) && s1.grade == s2.grade && s1.course != s2.course) {
                System.out.println("Objects are equal with only grade attribute and differs with rest 2: names(" + s1.name + " & " + s2.name + "); " +
                        "course(" + s1.course + " & " + s2.course + ");");
            } else if (!s1.name.equals(s2.name) && s1.grade != s2.grade && s1.course == s2.course) {
                System.out.println("Objects are equal with only course attribute and differs with rest 2: grade(" + s1.grade + " & " + s2.grade + "); " + " name(" + s1.name + " & " + s2.name + "); ");

            } else {
                System.out.println("Objects are not equal with all 3 attributes!");
            }

        }
    }

    public static void main(String[] args){
        Student st1 = new Student("Ivan", 3, 9.5);
        Student st2 = new Student("Petr1", 1,5.2);
        Student st3 = new Student("Petr", 1,5.3);
        Student.swap(st1, st2);
//        System.out.println("Print vnutri MAIN: "+st1.name);

        Student st4 = new Student("Oleg", 5, 7.5);

        differenceBetween(st3, st2);

    }


}