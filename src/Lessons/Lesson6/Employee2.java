package Lessons.Lesson6;

//thisStatement
public class  Employee2{

        Employee2 (int id2, String surname2, int age2) {
            this (surname2, age2);
        id = id2;
        }

        Employee2 (String surname3, int age3){
        surname = surname3;
        age = age3;
        }


        Employee2 (int id4, String surname4, int age4, double salary4, String department4) {
            this (id4, surname4, age4);
          salary = salary4;
          department = department4;
        }

        int id;
        String surname;
        int age;
        double salary;
        String department;
}


class EmployeeTest2{
    public static void main(String[] args) {
        Employee2 emp1 = new Employee2(1,"Ivanov", 25);
        System.out.println((emp1.surname));

        Employee2 emp2 = new Employee2("Petrov", 30);
        System.out.println((emp2.department));

        Employee2 emp3 = new Employee2(2,"Sidorov",40, 100.35,"IT");
        System.out.println((emp3.department));
    }
}
