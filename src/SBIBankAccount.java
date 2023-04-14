import java.util.UUID;

public class SBIBankAccount implements Bank{

    private  int balance;

    private String name;

    private int roi;//let's assume it is fixed for now 5%

    private String password;

    private String accountNumber;

    public SBIBankAccount(int balance, String name, String password) {
        this.balance = balance;
        this.name = name;
        this.password = password;
        this.accountNumber = String.valueOf(UUID.randomUUID());
        this.roi = 5;
    }

    public SBIBankAccount(String name, String password) {
        this.name = name;
        this.password = password;
        this.balance = 0;
        this.accountNumber = String.valueOf(UUID.randomUUID());
        this.roi = 5;

    }
    public  SBIBankAccount(){
        this.balance = 0;
        this.name = "defaultName";
        this.password = "password";
        this.accountNumber = String.valueOf(UUID.randomUUID());
        this.roi = 5;

    }

    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
    public double getBalanceAsDouble() {
        return Double.valueOf(String.valueOf(this.balance));
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoi() {
        return roi;
    }

    public void setRoi(int roi) {
        this.roi = roi;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }


    @Override
    public int checkBalance() {
        return this.balance;
    }

    @Override
    public boolean addMoney(int money) {
        this.balance += money;
        return true;
    }

    @Override
    public boolean withdrawMoney(int money) {
        if(this.balance < money) return  false;
        this.balance -= money;
        return true;
    }

    @Override
    public int getROI() {
        return this.roi;//should be updated on the basis of age
    }

    @Override
    public int totalInterest(int loanAmount, int timeInyear) {
        return loanAmount * roi * timeInyear / 100;
    }
}
