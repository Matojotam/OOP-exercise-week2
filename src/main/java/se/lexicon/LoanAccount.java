package se.lexicon;

public class LoanAccount extends Account {
    private final double loanRate;

    public LoanAccount(String holder, double balance, double loanRate) {
        super(holder, balance);
        if (loanRate < 0) {
            throw new IllegalArgumentException("Loan rate cannot be negative");
        }
        this.loanRate = loanRate;
    }

    @Override
    public void processMonth() {
        double interest = balance * loanRate;
        balance += interest;
        System.out.printf("[%s]: loan interest added %.2f kr%n", holder, interest);
    }
}
