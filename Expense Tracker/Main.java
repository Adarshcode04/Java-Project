import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ExpenseManager manager = new ExpenseManager();

        int id = 1;

        while (true) {

            System.out.println("\n==========================");
            System.out.println("      EXPENSE TRACKER");
            System.out.println("==========================");

            System.out.println("1. Add Expense");
            System.out.println("2. View Expenses");
            System.out.println("3. Search Expense");
            System.out.println("4. Delete Expense");
            System.out.println("5. Total Expense");
            System.out.println("6. Highest Expense");
            System.out.println("7. Exit");

            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {

                System.out.print("Enter title: ");
                String title = sc.nextLine();

                System.out.print("Enter category: ");
                String category = sc.nextLine();

                System.out.print("Enter amount: ");
                double amount = sc.nextDouble();

                Expense e = new Expense(id, title, category, amount);

                manager.addExpense(e);

                id++;

            } else if (choice == 2) {

                manager.viewExpenses();

            } else if (choice == 3) {

                System.out.print("Enter title to search: ");
                String title = sc.nextLine();

                manager.searchExpense(title);

            } else if (choice == 4) {

                System.out.print("Enter expense ID: ");
                int deleteId = sc.nextInt();

                manager.deleteExpense(deleteId);

            } else if (choice == 5) {

                manager.totalExpense();

            } else if (choice == 6) {

                manager.highestExpense();

            } else if (choice == 7) {

                System.out.println("Thank you!");
                break;

            } else {

                System.out.println("Invalid choice!");
            }
        }

        sc.close();
    }
}