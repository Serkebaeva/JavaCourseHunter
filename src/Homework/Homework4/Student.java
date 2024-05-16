package Homework.Homework4;

public class Student {
    static int counter = 1;
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

    public void getStudent(String name, String surname, int studyYear, double mathScore1, double mathScore2, double mathScore3, double economicsScore1, double economicsScore2, double economicsScore3, double avgFLScore1, double avgFLScore2, double avgFLScore3 ) {
        this.name = name;
        this.surname = surname;
        this.studyYear = studyYear;
        studentCardNumber = counter++;
        this.avgMath = getAvgScore.getMedium(mathScore1, mathScore2,mathScore3);
        this.avgEconomics = getAvgScore.getMedium(economicsScore1, economicsScore2,economicsScore3);
        this.avgForeignLanguage = getAvgScore.getMedium(avgFLScore1, avgFLScore2, avgFLScore3);
        System.out.println("Student Name: '" + name +"', Surname: '"+ surname+ "' is created.");
        System.out.println("Study Year - " + studyYear);
        System.out.println("Student Card Number - "+studentCardNumber);
        System.out.println("Student average Math Score - " + avgMath);
        System.out.println("Student average Economics Score - " + avgEconomics);
        System.out.println("Student average Foreign Language Score - " + avgForeignLanguage);
    }

}

class StudentTest {

    public static void main(String[] args) {
        Student st1 = new Student();
        st1.getStudent("Ivan", "Pak", 2023, 5, 4, 5, 4,4,4, 5,5,5);

        Student st2 = new Student();
        st2.getStudent("Masha", "Den", 2022, 5,2,3,3,3,3,4,4,4);

        Student st3 = new Student();
        st3.getStudent("Anna", "Lana", 2024, 5, 4,5,5,5,5,4,4,3);

        int totalCreatedStudents = Student.counter - 1;
        System.out.println("Total created students: " + totalCreatedStudents);
    }
}