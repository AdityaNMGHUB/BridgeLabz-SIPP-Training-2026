import java.io.*;
import java.util.*;

public class DailyExpenseLogger {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            // true enables append mode
            FileWriter fw = new FileWriter("expenses.txt", true);

            System.out.print("Enter Expense Category: ");
            String category = sc.nextLine();

            System.out.print("Enter Amount: ");
            double amount = sc.nextDouble();

            fw.write(category + " - " + amount + "\n");

            fw.close();

            System.out.println("Expense saved successfully.");

        } catch (IOException e) {
            System.out.println("Error while writing to file.");
        }

        sc.close();
    }
}