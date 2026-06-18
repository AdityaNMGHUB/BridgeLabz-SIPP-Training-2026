package senarioBased;

import java.util.Scanner;

class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

public class HospitalBillingSystem {

    static void makePayment(double billAmount, double payment)
            throws InsufficientFundsException {
        if (payment < billAmount) {
            throw new InsufficientFundsException("Payment failed: Insufficient funds.");
        }
        System.out.println("Payment successful.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] patientIds = {101, 102, 103, 104};

        try {
            System.out.print("Enter patient index: ");
            int index = Integer.parseInt(sc.nextLine());

            System.out.println("Patient ID: " + patientIds[index]);

            System.out.print("Enter total bill amount: ");
            double billAmount = Double.parseDouble(sc.nextLine());

            System.out.print("Enter number of items: ");
            int items = Integer.parseInt(sc.nextLine());

            double costPerItem = billAmount / items;
            System.out.println("Cost per item: " + costPerItem);

            System.out.print("Enter payment amount: ");
            double payment = Double.parseDouble(sc.nextLine());

            makePayment(billAmount, payment);

        } catch (ArithmeticException e) {
            System.out.println("Error: Number of items cannot be zero.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid patient index.");
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid numeric input.");
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}