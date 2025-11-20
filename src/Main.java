import services.ExpenseManager;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ExpenseManager manager = new ExpenseManager();
        boolean exit = false;

        System.out.println("=== Expense Tracker ===");

        while (!exit) {
            System.out.println("\n1. Add Expense");
            System.out.println("2. List Expenses");
            System.out.println("3. Search Expense");
            System.out.println("4. Update Expense");
            System.out.println("5. Delete Expense");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("Description: ");
                    String desc = scanner.nextLine();
                    System.out.print("Category: ");
                    String category = scanner.nextLine();
                    System.out.print("Amount: ");
                    String amount = scanner.nextLine();
                    System.out.print("Date (YYYY-MM-DD): ");
                    String date = scanner.nextLine();
                    manager.addExpense(desc, category, amount, date);
                    break;

                case "2":
                    manager.listExpenses();
                    break;

                case "3":
                    System.out.print("Search keyword: ");
                    String keyword = scanner.nextLine();
                    manager.searchExpense(keyword);
                    break;

                case "4":
                    System.out.print("Expense ID to update: ");
                    String updateId = scanner.nextLine();
                    System.out.print("New Description: ");
                    String newDesc = scanner.nextLine();
                    System.out.print("New Category: ");
                    String newCategory = scanner.nextLine();
                    System.out.print("New Amount: ");
                    String newAmount = scanner.nextLine();
                    System.out.print("New Date (YYYY-MM-DD): ");
                    String newDate = scanner.nextLine();
                    manager.updateExpense(updateId, newDesc, newCategory, newAmount, newDate);
                    break;

                case "5":
                    System.out.print("Expense ID to delete: ");
                    String deleteId = scanner.nextLine();
                    manager.deleteExpense(deleteId);
                    break;

                case "6":
                    exit = true;
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid option.");
            }
        }

        scanner.close();
    }
}
