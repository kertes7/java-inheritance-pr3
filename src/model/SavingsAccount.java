package model;

/** Похідний клас — Ощадний рахунок. */
public class SavingsAccount extends Account {

    public String label = "ощадний рахунок";   // приховує (shadows) поле базового класу
    private final double rate;

    public SavingsAccount(String owner, double balance, double rate) {
        super(owner, balance);                  // обов'язково: базовий конструктор приймає параметри
        this.rate = rate;
        System.out.println("[SavingsAccount] конструктор: " + owner);
    }

    @Override
    public String describe() {
        return super.describe() + " -> ОЩАДНИЙ (ставка " + rate + "%)";  // super викликає батьківську версію
    }
}
