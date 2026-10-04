public class Expense {

    int id;
    String title;
    String category;
    double amount;

    Expense(int id, String title, String category, double amount) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.amount = amount;
    }

    void display() {
        System.out.println(id + " | " + title + " | " + category + " | ₹" + amount);
    }

    public static void main(String[] args) {
        Main.main(args);
    }
}