package app;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

import model.Developer;
import model.Employee;
import model.Manager;

public class Main {

    public static void main(String[] args) {
        // Весь вивід (зокрема з конструкторів класів домену) — у UTF-8:
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        PrintStream out = System.out;

        out.println("=== Дослід 1: @Override + super ===");
        Manager m = new Manager("Іван", 25000, 8000);
        out.println("m.describe() -> " + m.describe());

        out.println();
        out.println("=== Дослід 2: порядок конструкторів ===");
        out.println("Створюємо new Manager(\"Петро\", 20000, 5000):");
        Employee e = new Manager("Петро", 20000, 5000);   // базовий тип посилання
        out.println("(спершу [Employee], потім [Manager])");
        // Manager d = new Employee("X", 0);               // ПОМИЛКА компіляції: Employee не є Manager
        // (якщо прибрати super(...) у Manager — ПОМИЛКА: there is no default constructor available in Employee)

        out.println();
        out.println("=== Дослід 3: поле за типом посилання, метод за фактичним типом ===");
        Manager mref = new Manager("Олена", 30000, 10000);
        Employee eref = mref;                               // те саме посилання, базовий тип
        out.println("mref.label  = " + mref.label);         // менеджер
        out.println("eref.label  = " + eref.label);         // базовий працівник (поле — за типом посилання)
        out.println("eref.describe() = " + eref.describe());// МЕНЕДЖЕР (метод — за фактичним типом)

        out.println();
        out.println("=== Додатково: другий похідний клас ===");
        Employee dev = new Developer("Сергій", 28000, "Java/Spring");
        out.println("dev.label = " + dev.label + " | dev.describe() = " + dev.describe());
    }
}
