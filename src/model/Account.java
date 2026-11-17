package model;

/** Базовий клас ієрархії (варіант 3 — Рахунок). */
public class Account {

    public String label = "базовий рахунок";   // поле з однаковим іменем (дослід 3)
    protected String owner;
    protected double balance;

    /** Лише конструктор з параметрами — конструктора без аргументів немає. */
    public Account(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
        System.out.println("[Account] конструктор: " + owner);
    }

    /** Метод, що перевизначається в похідних (дослід 1 і 3). */
    public String describe() {
        return "рахунок власника " + owner + ", баланс " + balance;
    }
}
