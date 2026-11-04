package se.lexicon;

public class SavingsAccount extends Account {
    private final double interestRate;

    public SavingsAccount(String holder, double balance, double interestRate) {
        super(holder, balance);
        if (interestRate < 0) {
            throw new IllegalArgumentException("Interest rate cannot be negative");
        }
        this.interestRate = interestRate;
    }

    @Override
    public void processMonth() {
        double interest = balance * interestRate;
        balance += interest;
        System.out.printf("[%s]: interest credited %.2f kr%n", holder, interest);
    }
}
