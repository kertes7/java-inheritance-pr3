package model;

/** Похідний клас — Кредитний рахунок. */
public class CreditAccount extends Account {

    public String label = "кредитний рахунок";  // приховує поле базового класу
    private final double limit;

    public CreditAccount(String owner, double balance, double limit) {
        super(owner, balance);
        this.limit = limit;
        System.out.println("[CreditAccount] конструктор: " + owner);
    }

    @Override
    public String describe() {
        return super.describe() + " -> КРЕДИТНИЙ (ліміт " + limit + ")";
    }
}
