import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Delete Student");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter ID: ");
                int id = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter Name: ");
                String name = sc.nextLine();
                System.out.print("Enter Marks: ");
                double marks = sc.nextDouble();

                students.add(new Student(id, name, marks));
                System.out.println("Student added!");

            } else if (choice == 2) {
                if (students.isEmpty()) {
                    System.out.println("No students yet.");
                } else {
                    for (Student s : students) {
                        System.out.println(s);
                    }
                }

            } else if (choice == 3) {
                System.out.print("Enter ID to delete: ");
                int id = sc.nextInt();
                students.removeIf(s -> s.id == id);
                System.out.println("Deleted if found.");
            }

        } while (choice != 4);

        System.out.println("Goodbye!");
        sc.close();
    }
}
