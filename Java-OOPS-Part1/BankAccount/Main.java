package BankAccount;

public class Main {

    public static void main(String[] args) {
        Account ac = new Account();
        //Account ac = new Account(1234,2000,"Pavan","12344555","makhddghih");
        //ac.setAccountBalance(1000);
        System.out.println("initial  balance "+ac.getAccountBalance());
        ac.deposit(2000);
        ac.withdraw(500);
    }

}
