package Homework.Homework7;

public class methods2Show {

    public static class showInfoPrivate{
        public static void show(Employee7 employeePrivate){
            System.out.println("ID: " + employeePrivate.employeeDefault.id);
            System.out.println("Name: " + employeePrivate.name);
            System.out.println("Surname: " + employeePrivate.surname);
            System.out.println("Age: " + employeePrivate.getAge());
            System.out.println("Salary: " + employeePrivate.getSalary());
            System.out.println("Department: " + employeePrivate.department);
        }

    }

   public static class showInfoDefault(){
       public static void show(Employee7 employeeDefault){
           System.out.println("ID: " + employeeDefault.employeeDefault.id);
           System.out.println("Name: " + employeeDefault.name);
           System.out.println("Surname: " + employeeDefault.surname);
           System.out.println("Department: " + employeeDefault.department);
       }

    }


}
