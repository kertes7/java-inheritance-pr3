package model;

/** Базовий клас ієрархії (варіант 0 — Працівник). */
public class Employee {

    public String label = "базовий працівник";   // поле з однаковим іменем (дослід 3)
    protected String name;
    protected double baseSalary;

    /** Лише конструктор з параметрами — конструктора без аргументів немає. */
    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
        System.out.println("[Employee] конструктор: " + name);
    }

    /** Метод, що перевизначається в похідних (дослід 1 і 3). */
    public String describe() {
        return "працівник " + name + ", оклад " + baseSalary;
    }
}
