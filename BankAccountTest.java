public class BankAccountTest {

    public static void main (String[] args) {

        // Creating bank accounts
        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount();
        BankAccount account3 = new BankAccount(500.0, 500.0);
        BankAccount account4 = new BankAccount(1000.0, 1000.0);
        BankAccount account5 = new BankAccount (5000.0, 5000.0);

        // Testing getNumberOfAccounts method
        System.out.printf("\nTotal Number of Accounts: %s\n", BankAccount.getNumberOfAccounts());

        // Testing getTotalBankMoney method
        System.out.printf("Total Bank Holdings: $%.2f\n", BankAccount.getTotalBankMoney());

        // Testing deposit and withdrawal methods
        account1.depositChecking(200.0);
        account2.depositSavings(400.0);
        account3.withdrawChecking(300.0);
        account3.withdrawSavings(600.0);
        account4.withdrawChecking(1100.0);
        account4.withdrawSavings(200.0);

        // Testing viewTotalBalance method
        account1.viewTotalBalance();
        account2.viewTotalBalance();
        account3.viewTotalBalance();
        account4.viewTotalBalance();
        account5.viewTotalBalance();

        System.out.printf("\nTotal Bank Holdings: $%.2f\n", BankAccount.getTotalBankMoney());

    }

}