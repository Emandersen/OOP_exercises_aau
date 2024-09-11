package session2.E_Encapsulation;


import session2.E_Encapsulation.bank.BankAccount;

public class BankAccountDemo {

    public static void main(String[] args) {
        BankAccount account = new BankAccount("Andres Masegosa", 100);

        account.setName("Anders Madsen");

        System.out.println(account.getBalance());
        System.out.println(account.getName());

        account.withdraw(75_000);


        System.out.println(account.getBalance());
        System.out.println(account.getName());

    }

}
