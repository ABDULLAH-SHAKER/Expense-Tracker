💰 Expense-Tracker
<p align="center"> <img src="/src/assets/header.png" width="600" alt="Expense-Tracker" /> </p>

Expense-Tracker is a simple, clean, and lightweight Java application designed to help you manage your personal expenses through a friendly Command Line Interface (CLI).
It is beginner-friendly and built using Object-Oriented Programming (OOP) principles with clean file handling and a modular structure.

## ⭐ Features

- Add new expenses (Description, Category, Amount, Date)

- List all stored expenses

- Search expenses by keyword

- Update existing records easily

- Delete unwanted expenses

- Auto-save and load from expenses.csv

- Organized folder structure + readable and clean Java code

- Designed for easy expansion (GUI, database, etc.)

## 🧩 Project Structure
```
Expense-Tracker/
│
├── src/
│   ├── Main.java
│   ├── models/
│   │   └── Expense.java
│   ├── services/
│   │   └── ExpenseManager.java
│
├── data/
│   └── expenses.csv
│
├── assets/
│   └── header.png
│
└── README.md
```

---

## 🎯 Project Goals

- Practice building real Java projects

- Apply OOP concepts in a practical way

- Learn how to handle files with Java I/O

- Build a working console-based application

- Enable future enhancements (GUI, database, cloud storage)

- Improve code structure, maintainability, and readability

---

## 🛠️ Technologies Used
- **Java 17+**
- **CLI Interface**
- **Object-Oriented Programming**
- **File Handling (CSV Storage)**

---

## 🚀 How to Run

1. **Clone the repository**
```bash
git clone https://github.com/ABDULLAH-SHAKER/Expense-Tracker.git
cd Expense-Tracker
```

2. **Create `bin` directory and compile all Java files**
```bash
mkdir -p bin
javac -d bin src/**/*.java
```

3. **Run the application**
```bash
java -cp bin Main
```

---

## 💻 Example CLI Usage

```
=== Expense Tracker ===
1. Add Expense
2. List Expenses
3. Search Expense
4. Update Expense
5. Delete Expense
6. Exit

Choose an option: 1
Description: Coffee
Category: Food
Amount: 12
Date (YYYY-MM-DD): 2024-11-18
Expense added successfully!
```

---

## 📦 Storage Details

- All expenses are saved in data/expenses.csv

- File format:

- description,category,amount,date

- 📝 Roadmap / TODO

- Add a GUI version (JavaFX)

- Export reports (PDF, Excel)

- Add monthly statistics & graphs

- Add categories and analytics

- Support cloud sync or database storage

---

## 👤 Author
**Abdullah Shaker**  
- GitHub: [ABDULLAH-SHAKER](https://github.com/ABDULLAH-SHAKER)  
- Contact: `Abdullah.bamalhas@gmail.com`

---