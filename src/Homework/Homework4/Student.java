package Homework.Homework4;

public class Student {
    static int counter;
    String name;
    String surname;
    int studyYear;
    int studentCardNumber;
    double avgMath;
    double avgEconomics;
    double avgForeignLanguage;

    class getAvgScore {
        public static int getMedium(double a, double b, double c) {
            return (int) ((a+b+c)/3);
        }
    }

    public void getStudent(String name, String surname, int studyYear) {
        this.name = name;
        this.surname = surname;
        this.studyYear = studyYear;
        this.avgMath = getAvgScore.getMedium(5,4,3);
        this.avgEconomics = getAvgScore.getMedium(3,2,4);
        this.avgForeignLanguage = getAvgScore.getMedium(4,5,5);
        studentCardNumber = counter++;
        System.out.println("Student Name: '" + name +"', Surname: '"+ surname+ "' is created.");
        System.out.println("Study Year - " + studyYear);
        System.out.println("Student Card Number - "+studentCardNumber);
    }

}

class StudentTest {

    public static void main(String[] args) {
        Student st1 = new Student();
        st1.getStudent("Ivan", "Pak", 2023);
        System.out.println("Student average Math Score - " + st1.avgMath);
        System.out.println("Student average Economics Score - " + st1.avgEconomics);
        System.out.println("Student average Foreign Language Score - " + st1.avgForeignLanguage);
    }
}