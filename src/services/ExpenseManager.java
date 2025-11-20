package services;

import models.Expense;
import utils.CSVHandler;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ExpenseManager {

    private List<Expense> expenses;
    private final String fileName = "expenses.csv";

    public ExpenseManager() {
        expenses = CSVHandler.loadFromCSV(fileName);
    }

    // Add new expense
    public void addExpense(String desc, String category, String amountStr, String date) {
        double amount;

        try {
            amount = Double.parseDouble(amountStr);
        } catch (NumberFormatException e) {
            System.out.println("Invalid amount value!");
            return;
        }

        String id = UUID.randomUUID().toString().substring(0, 8);
        Expense expense = new Expense(id, desc, category, amount, date);

        expenses.add(expense);
        CSVHandler.saveToCSV(expenses, fileName);
        System.out.println("Expense added successfully!");
    }

    // List all expenses
    public void listExpenses() {
        if (expenses.isEmpty()) {
            System.out.println("No expenses found.");
            return;
        }

        for (Expense e : expenses) {
            System.out.println(e);
        }
    }

    // Search expense by keyword
    public void searchExpense(String keyword) {
        boolean found = false;

        for (Expense e : expenses) {
            if (e.getDescription().toLowerCase().contains(keyword.toLowerCase()) ||
                e.getCategory().toLowerCase().contains(keyword.toLowerCase())) {

                System.out.println(e);
                found = true;
            }
        }

        if (!found)
            System.out.println("No matching results found.");
    }

    // Update expense
    public void updateExpense(String id, String newDesc, String newCategory, String newAmountStr, String newDate) {
        double newAmount;

        try {
            newAmount = Double.parseDouble(newAmountStr);
        } catch (NumberFormatException e) {
            System.out.println("Invalid amount value!");
            return;
        }

        boolean updated = false;

        for (int i = 0; i < expenses.size(); i++) {
            Expense e = expenses.get(i);

            if (e.getId().equals(id)) {
                expenses.set(i, new Expense(id, newDesc, newCategory, newAmount, newDate));
                updated = true;
                break;
            }
        }

        if (updated) {
            CSVHandler.saveToCSV(expenses, fileName);
            System.out.println("Expense updated successfully!");
        } else {
            System.out.println("No expense found with that ID.");
        }
    }

    // Delete expense
    public void deleteExpense(String id) {
        boolean removed = expenses.removeIf(e -> e.getId().equals(id));

        if (removed) {
            CSVHandler.saveToCSV(expenses, fileName);
            System.out.println("Expense deleted successfully!");
        } else {
            System.out.println("No expense found with that ID.");
        }
    }
}
