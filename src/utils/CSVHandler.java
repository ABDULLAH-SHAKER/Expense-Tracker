package utils;

import models.Expense;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CSVHandler {

    public static void saveToCSV(List<Expense> expenses, String fileName) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {

            for (Expense e : expenses) {
                writer.println(e.getId() + "," +
                        e.getDescription() + "," +
                        e.getCategory() + "," +
                        e.getAmount() + "," +
                        e.getDate());
            }

        } catch (IOException e) {
            System.out.println("Error saving CSV: " + e.getMessage());
        }
    }

    public static List<Expense> loadFromCSV(String fileName) {
        List<Expense> list = new ArrayList<>();
        File file = new File(fileName);

        if (!file.exists())
            return list;

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {

            String line;
            while ((line = br.readLine()) != null) {

                String[] data = line.split(",");
                if (data.length != 5) continue;

                Expense e = new Expense(
                        data[0],
                        data[1],
                        data[2],
                        Double.parseDouble(data[3]),
                        data[4]
                );

                list.add(e);
            }

        } catch (IOException e) {
            System.out.println("Error loading CSV: " + e.getMessage());
        }

        return list;
    }
}
