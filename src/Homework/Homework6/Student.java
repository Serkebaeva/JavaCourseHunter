package Homework.Homework6;

public class Student {

    static int counter = 1;
    int id;
    String name;
    String surname;
    int course;
    double avgMath;
    double avgEconomics;
    double avgForeignLanguage;

    void showInfo(){
        System.out.println("Student Name: '" + name +"', Surname: '"+ surname+ "' is created.");
        System.out.println("Student Card Number and ID: "+ id);
        System.out.println("Study Year: " + course + " course");
        System.out.println("Student average Math Score: " + avgMath);
        System.out.println("Student average Economics Score: " + avgEconomics);
        System.out.println("Student average Foreign Language Score: " + avgForeignLanguage);
    }

    Student(String name1, String surname1, int course1, double avgMath1, double avgEconomics1, double avgForeignLanguage1){
        id = counter++;
        name = name1;
        surname = surname1;
        course = course1;
        avgMath = avgMath1;
        avgEconomics = avgEconomics1;
        avgForeignLanguage = avgForeignLanguage1;

    }

    Student(String name2, String surname2, int course2){
        id = counter++;
        name = name2;
        surname = surname2;
        course = course2;
    }

    Student(){
        id = counter++;
    }

    public static void main(String[] args) {
        Student s1 = new Student("Ivan","Belov", 3, 4.5,4.9,5.0);
        s1.showInfo();
        System.out.println("----------------------------------------------------------------------------------");

        Student s2 = new Student("Masha","Lana", 2);
        s2.showInfo();
        System.out.println("----------------------------------------------------------------------------------");

        Student s3 = new Student();
        s3.showInfo();
        System.out.println("----------------------------------------------------------------------------------");



    }
}

