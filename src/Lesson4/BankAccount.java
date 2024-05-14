package Lesson4;

public class BankAccount {

    int id;
    String name;
    double balance;

    public static void main(String[] args) {
        BankAccount MyAccount = new BankAccount();
        BankAccount YourAccount = new BankAccount();
        BankAccount HisAccount = new BankAccount();

        MyAccount.id = 1;
        MyAccount.name = "Aiza";
        MyAccount.balance = 13.5;

        System.out.println(MyAccount.balance);
        System.out.println(HisAccount.balance);
    }

}
