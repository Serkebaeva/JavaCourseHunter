package Homework.Homework12;

 import Homework.Homework12.Student;
 import Homework.Homework12.StudentTest;

 /// HomeWork 12 Answer, how I supposed to decide it...

class nestedIfStatementTest{

    public static void nestedIfStatement(Student s1, Student s2) {
        if (s1.name.equals(s2.name)) {
            if (s1.course == s2.course) {
                if (s1.grade == s2.grade) {
                    System.out.println("Имена студентов, курсы и оценки одинаковые");
                } else {
                    System.out.println("Имена студентов и курсы одинаковые, но оценки различаются");
                }
            } else {
                System.out.println("Имена студентов oдинаковые, но курсы различаются");
            }
        } else {
            System.out.println("Имена студентов различаются");
        }
    }


    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 3, 9.5);
        Student st2 = new Student("Petr", 5,5.3);
        Student st3 = new Student("Petr", 1,5.3);

        nestedIfStatement(st3, st2);
       // nestedIfStatement(st1, st2);
    }
}