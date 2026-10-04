import java.util.*;

public class ExpenseManager {

    ArrayList<Expense> list = new ArrayList<>();

    void addExpense(Expense e) {
        list.add(e);
        System.out.println("Expense added successfully!");
    }

    void viewExpenses() {
        if (list.size() == 0) {
            System.out.println("No expenses found!");
            return;
        }

        System.out.println("\nID | Title | Category | Amount");
        System.out.println("--------------------------------");

        for (Expense e : list) {
            e.display();
        }
    }

    void searchExpense(String title) {
        boolean found = false;

        for (Expense e : list) {
            if (e.title.equalsIgnoreCase(title)) {
                e.display();
                found = true;
            }
        }

        if (!found) {
            System.out.println("Expense not found!");
        }
    }

    void deleteExpense(int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).id == id) {
                list.remove(i);
                System.out.println("Expense deleted!");
                return;
            }
        }

        System.out.println("Expense not found!");
    }

    void totalExpense() {
        double total = 0;

        for (Expense e : list) {
            total += e.amount;
        }

        System.out.println("Total Expense: ₹" + total);
    }

    void highestExpense() {
        if (list.size() == 0) {
            System.out.println("No expenses found!");
            return;
        }

        Expense max = list.get(0);

        for (Expense e : list) {
            if (e.amount > max.amount) {
                max = e;
            }
        }

        System.out.println("Highest Expense:");
        max.display();
    }
}