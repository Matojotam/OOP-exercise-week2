package se.lexicon;

public abstract class Account {
    protected String holder;
    protected double balance;

    public Account(String holder, double balance) {
        if (holder == null || holder.trim().isEmpty()) {
            throw new IllegalArgumentException("Holder name cannot be blank");
        }
        if (balance < 0) {
            throw new IllegalArgumentException("Balance cannot be negative");
        }
        this.holder = holder;
        this.balance = balance;
    }

    public String getHolder() {
        return holder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Cannot deposit negative amount");
        }
        balance += amount;
    }

    public abstract void processMonth();

    public void printSummary() {
        System.out.printf("[%s] | Balance: %.2f kr%n", holder, balance);
    }
}