package senarioBased;

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

class Account {
    private double balance = 5000;

    public void withdraw(double amount)
            throws InsufficientBalanceException {

        if (amount > balance) {
            throw new InsufficientBalanceException(
                "Insufficient Balance! Available Balance: ₹"
                + balance + ", Requested: ₹" + amount);
        }

        balance -= amount;
        System.out.println("Withdrawal Successful. Remaining Balance: ₹" + balance);
    }
}

public class ATMWithdrawalSystem {
    public static void main(String[] args) {
        Account acc = new Account();

        try {
            acc.withdraw(8000);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}