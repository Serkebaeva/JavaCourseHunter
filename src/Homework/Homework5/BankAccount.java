package Homework.Homework5;

public class BankAccount {
    double balans;
    static int idScheta = 0;
    String name;
    String surname;

    double popolnenieScheta(double sum) {
        balans += sum;
        return balans;
        /*System.out.println("Balans uvelichen na summu: " +sum+ ". Obnovlennyi balans: "+balans);*/
    }

    double snyatieSoScheta(double sum1) {
        balans -= sum1;
        return balans;
        /*System.out.println("Balans umenshilasya na summu: " +sum1+". Obnovlennyi balans: "+balans);*/
    }

    void showInfo() {
        System.out.println("Bank Account number: "+idScheta);
        System.out.println("Bank Account holder Name: "+ name);
        System.out.println("Bank Account holder Surname: "+ this.surname);
        System.out.println("Bank Account balans = " + balans);
    }


}

class BankAccountTest {

    public static void main(String[] args) {
        BankAccount bA = new BankAccount();
        bA.idScheta++;
        bA.name = "Ivan";
        bA.surname = "Petrov";
        System.out.println("balans = " + bA.balans);
        bA.popolnenieScheta(200);
        System.out.println("Balans uvelichen. Obnovlennyi balans: "+  bA.balans );
        bA.snyatieSoScheta(50);
        System.out.println("Balans izmenen. Obnovlennyi balans: "+  bA.balans);
        bA.showInfo();

        System.out.println("--------------------------------------------");

        BankAccount bA2 = new BankAccount();
        bA2.idScheta++;
        bA2.name = "Masha";
        bA2.surname = "Petruk";
        System.out.println("balans = " + bA2.balans);
        bA2.popolnenieScheta(100);
        System.out.println("Balans uvelichen. Obnovlennyi balans: "+  bA2.balans );
        bA2.snyatieSoScheta(30);
        System.out.println("Balans izmenen. Obnovlennyi balans: "+  bA2.balans);
        bA2.showInfo();

        System.out.println("--------------------------------------------");


        System.out.println("balans = " + bA2.balans);
        bA2.popolnenieScheta(100);
        System.out.println("Balans uvelichen. Obnovlennyi balans: "+  bA2.balans );
        bA2.snyatieSoScheta(50);
        System.out.println("Balans izmenen. Obnovlennyi balans: "+  bA2.balans);
        bA2.showInfo();

    }


}
