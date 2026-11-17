package model;

/** Похідний клас — Розробник. */
public class Developer extends Employee {

    public String label = "розробник";          // приховує поле базового класу
    private final String stack;

    public Developer(String name, double baseSalary, String stack) {
        super(name, baseSalary);
        this.stack = stack;
        System.out.println("[Developer] конструктор: " + name);
    }

    @Override
    public String describe() {
        return super.describe() + " -> РОЗРОБНИК (стек " + stack + ")";
    }
}
