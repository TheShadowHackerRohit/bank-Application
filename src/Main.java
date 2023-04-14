import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Let's create a bank account");

        Scanner sc = new Scanner(System.in);


        Bank sbiBankAccount = new SBIBankAccount(1000,"Rohit","Rohit12345");
        sbiBankAccount.addMoney(100);
        boolean withdrawStatus = sbiBankAccount.withdrawMoney(1300);

        if(Boolean.TRUE.equals(withdrawStatus)){
            System.out.println("successfully withdraw");
        }

        int balance = sbiBankAccount.checkBalance();


        SBIBankAccount sbiBankAcc2 =  new SBIBankAccount();

        sbiBankAcc2.setName("Abhishek");
        sbiBankAcc2.setBalance(10000);
        sbiBankAcc2.setPassword("pass");



    }
}
