package se.lexicon;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private final String name;
    private final List<Account> accounts;

    public Bank(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void processAllAccounts() {
        for (Account account : accounts) {
            account.processMonth();
        }
    }

    public void printAllSummaries() {
        System.out.println("=== " + name + " Accounts Summary ===");
        for (Account account : accounts) {
            account.printSummary();
        }
        System.out.println("===============================");
    }
}
