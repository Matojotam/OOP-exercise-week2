package se.lexicon;

public class CheckingAccount extends Account {
    private final double monthlyFee;

    public CheckingAccount(String holder, double balance, double monthlyFee) {
        super(holder, balance);
        if (monthlyFee < 0) {
            throw new IllegalArgumentException("Monthly fee cannot be negative");
        }
        this.monthlyFee = monthlyFee;
    }

    @Override
    public void processMonth() {
        if (balance >= monthlyFee) {
            balance -= monthlyFee;
            System.out.printf("[%s]: monthly fee charged %.2f kr%n", holder, monthlyFee);
        } else {
            System.out.printf("[%s]: insufficient balance for fee%n", holder);
        }
    }
}
