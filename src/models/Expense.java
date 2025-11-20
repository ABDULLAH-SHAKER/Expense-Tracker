package models;

public class Expense {
    private String id;
    private String description;
    private String category;
    private double amount;
    private String date;

    public Expense(String id, String description, String category, double amount, String date) {
        this.id = id;
        this.description = description;
        this.category = category;
        this.amount = amount;
        this.date = date;
    }

    public String getId() { return id; }
    public String getDescription() { return description; }
    public String getCategory() { return category; }
    public double getAmount() { return amount; }
    public String getDate() { return date; }

    @Override
    public String toString() {
        return "ID: " + id +
                " | Desc: " + description +
                " | Category: " + category +
                " | Amount: " + amount +
                " | Date: " + date;
    }
}
