package app;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

import model.Account;
import model.CreditAccount;
import model.SavingsAccount;

public class Main {

    public static void main(String[] args) {
        // Весь вивід (зокрема з конструкторів класів домену) — у UTF-8:
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        PrintStream out = System.out;

        out.println("=== Дослід 1: @Override + super ===");
        SavingsAccount s = new SavingsAccount("Іван", 1000, 5);
        out.println("s.describe() -> " + s.describe());

        out.println();
        out.println("=== Дослід 2: порядок конструкторів ===");
        out.println("Створюємо new SavingsAccount(\"Петро\", 500, 7):");
        Account b = new SavingsAccount("Петро", 500, 7);   // базовий тип посилання
        out.println("(спершу [Account], потім [SavingsAccount])");
        // SavingsAccount d = new Account("X", 0);         // ПОМИЛКА компіляції: Account не є SavingsAccount
        // (якщо прибрати super(...) у SavingsAccount — ПОМИЛКА: there is no default constructor available in Account)

        out.println();
        out.println("=== Дослід 3: поле за типом посилання, метод за фактичним типом ===");
        SavingsAccount sref = new SavingsAccount("Олена", 300, 3);
        Account aref = sref;                                // те саме посилання, базовий тип
        out.println("sref.label  = " + sref.label);         // ощадний рахунок
        out.println("aref.label  = " + aref.label);         // базовий рахунок (поле — за типом посилання)
        out.println("aref.describe() = " + aref.describe());// ОЩАДНИЙ (метод — за фактичним типом)

        out.println();
        out.println("=== Додатково: другий похідний клас ===");
        Account c = new CreditAccount("Сергій", -200, 5000);
        out.println("c.label = " + c.label + " | c.describe() = " + c.describe());
    }
}
