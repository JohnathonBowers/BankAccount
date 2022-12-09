public class BankAccount {

    private Double checkingBalance;
    private Double savingsBalance;
    private static int numberOfAccounts = 0;
    private static Double totalMoneyStored = 0.0;

    public static int getNumberOfAccounts() {
        return numberOfAccounts;
    }

    public static Double getTotalBankMoney () {
        return totalMoneyStored;
    }

    public BankAccount() {
        this.checkingBalance = 0.0;
        this.savingsBalance = 0.0;
        numberOfAccounts ++;
    }

    public BankAccount(Double checkingStartBalance, Double savingsStartBalance) {
        this.checkingBalance = checkingStartBalance;
        this.savingsBalance = savingsStartBalance;
        numberOfAccounts++;
        totalMoneyStored += (checkingStartBalance + savingsStartBalance);
    }

    public Double getCheckingBalance() {
        return checkingBalance;
    }

    public Double getSavingsBalance() {
        return savingsBalance;
    }

    public void depositChecking(Double checkingDepositAmount) {
        checkingBalance += checkingDepositAmount;
        totalMoneyStored += checkingDepositAmount;
        System.out.printf("\nDeposit Amount: $%.2f\n", checkingDepositAmount);
        System.out.printf("Checking Account Balance: $%.2f\n", checkingBalance);
    }
    
    public void depositSavings(Double savingsDepositAmount) {
        savingsBalance += savingsDepositAmount;
        totalMoneyStored += savingsDepositAmount;
        System.out.printf("\nDeposit Amount: $%.2f\n", savingsDepositAmount);
        System.out.printf("Savings Account Balance: $%.2f\n", savingsBalance);
    }

    public void withdrawChecking(Double checkingWithdrawalAmount) {
        if (checkingWithdrawalAmount < checkingBalance) {
            checkingBalance -= checkingWithdrawalAmount;
            totalMoneyStored -= checkingWithdrawalAmount;
            System.out.printf("\nWithdrawal Amount: $%.2f\n", checkingWithdrawalAmount);
            System.out.printf("Checking Account Balance: $%.2f\n", checkingBalance);
        } else {
            System.out.println("\nInsufficient funds. Transaction canceled.");
        }
    }

    public void withdrawSavings(Double savingsWithdrawalAmount) {
        if (savingsWithdrawalAmount < savingsBalance) {
            savingsBalance -= savingsWithdrawalAmount;
            totalMoneyStored -= savingsWithdrawalAmount;
            System.out.printf("\nWithdrawal Amount: $%.2f\n", savingsWithdrawalAmount);
            System.out.printf("Checking Account Balance: $%.2f\n", savingsBalance);
        } else {
            System.out.println("\nInsufficient funds. Transaction canceled.");
        }
    }

    public void viewTotalBalance() {
        Double totalBalance = savingsBalance + checkingBalance;
        System.out.printf("\nTotal money available in checking and savings: $%.2f\n", totalBalance);
    }
}