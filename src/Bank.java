public interface Bank {
    int checkBalance();

    boolean addMoney(int money);

    boolean   withdrawMoney(int money);

    int getROI();

    int totalInterest(int loanAmount, int timeInYear);
}
