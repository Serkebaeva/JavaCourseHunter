package Lessons.Lesson6;

public class Employee {

    //Sozdanie 3-x konstruktorov Overloaded... (nelzya ispolzovat' odinakovye parametry...)
    Employee (int id2, String surname2, int age2) {
        id = id2;
        surname = surname2;
        age = age2;
    }

    Employee (String surname2, int age2){
        surname = surname2;
        age = age2;
    }


    Employee (int id2, String surname2, int age2, double salary2, String department2) {
        id = id2;
        surname = surname2;
        age = age2;
        salary = salary2;
        department = department2;
    }

    int id;
    String surname;
    int age;
    double salary;
    String department;
}


/// sozdanie ob'ekta s pomoshyu raznyh konstruktorov
class EmployeeTest{
    public static void main(String[] args) {
        Employee emp1 = new Employee(1,"Ivanov", 25);
        System.out.println((emp1.surname));

        Employee emp2 = new Employee("Petrov", 30);
        System.out.println((emp2.department));

        Employee emp3 = new Employee(2,"Sidorov",40, 100.35,"IT");
        System.out.println((emp3.department));
    }
}
