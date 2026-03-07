package BankAccount;

public class Account {

    private int accountNumber;
    private int accountBalance;
    private String customerName;
    private String mobile;
    private String email;

    //No Arg Constructor is implicitly declared if not 
    public Account() {
        //Constructor Chaining
        //this should be the first line to be executed
        this(123456,3000,"DefaultName","DefaultNumber","DefaultEmail");
         System.out.println("Constructor with no Args Called");
    }
    //constructor overloading
    public Account(int accountNumber, int accountBalance, String customerName, String mobile, String email) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customerName = customerName;
        this.mobile = mobile;
        this.email = email;

        System.out.println("Constructor with parameters called");
    }

    public int getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    public int getAccountBalance() {
        return accountBalance;
    }
    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }
    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public String getMobile() {
        return mobile;
    }
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public void deposit(int money){
        this.accountBalance= this.accountBalance+money;
        System.out.println("Amount is deposited with "+money);
        System.out.println("current balance "+(this.accountBalance));
    }

    public void withdraw(int money){
        if(this.accountBalance-money>0){
            this.accountBalance=this.accountBalance-money;
            System.out.println("Amount withdraw with "+money);
            System.out.println((this.accountBalance)+"Account balance");
        }
        else System.out.println("insufficient balance");
    }

    

}
