package se.lexicon;

public class BankApp {
    static void main() {
        Bank lexiconBank = new Bank("Lexicon Bank");
        
        // Create accounts
        SavingsAccount savings = new SavingsAccount("Alice", 1000, 0.02);
        CheckingAccount checking = new CheckingAccount("Bob", 500, 25);
        LoanAccount loan = new LoanAccount("Charlie", 5000, 0.03);
        
        // Add accounts to bank
        lexiconBank.addAccount(savings);
        lexiconBank.addAccount(checking);
        lexiconBank.addAccount(loan);
        
        // Print initial balances
        System.out.println("=== Initial Balances ===");
        lexiconBank.printAllSummaries();
        
        // Process month-end
        System.out.println("\n=== Processing Month-End ===");
        lexiconBank.processAllAccounts();
        
        // Print updated balances
        System.out.println("\n=== Final Balances ===");
        lexiconBank.printAllSummaries();
    }
}
