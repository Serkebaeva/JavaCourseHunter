package Homework.Homework7;

public class Employee7 {
    static int idCounter = 1;
    String department;
    String name;
    String surname;
    Default employeeDefault;
    Private employeePrivate;

    class Default{
        int id;
    }

    private class Private {
        double salary;
        int age;
    }

    public Employee7(String surname1, String name1, int age1, double salary1, String department1) {
        this.employeeDefault = new Default();
        this.employeeDefault.id = idCounter++;

        this.surname = surname1;
        this.name = name1;
        this.department = department1;

        this.employeePrivate = new Private();
        this.employeePrivate.age = age1;
        this.employeePrivate.salary = salary1;
    }

    // Optional: add getters to access private inner class variables
    public double getSalary() {
        return this.employeePrivate.salary;
    }

    public int getAge() {
        return this.employeePrivate.age;
    }


}

public static void main(String[] args) {
    Employee7 employeePrivate = new Employee7("Smith", "John", 30, 50000.0, "IT");
    methods2Show.showInfoPrivate.show(employeePrivate);
    System.out.println("===============================================================================");

    Employee7 employeeDefault = new Employee7("Petrov", "Ivan", 50, 40000.0, "Marketing");
    methods2Show.showInfoDefault.show(employeeDefault);
    System.out.println("===============================================================================");

}