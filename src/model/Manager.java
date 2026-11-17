package model;

/** Похідний клас — Менеджер. */
public class Manager extends Employee {

    public String label = "менеджер";          // приховує (shadows) поле базового класу
    private final double bonus;

    public Manager(String name, double baseSalary, double bonus) {
        super(name, baseSalary);                // обов'язково: базовий конструктор приймає параметри
        this.bonus = bonus;
        System.out.println("[Manager] конструктор: " + name);
    }

    @Override
    public String describe() {
        return super.describe() + " -> МЕНЕДЖЕР (бонус " + bonus + ")";  // super викликає батьківську версію
    }
}
