public class Atm {
    private double balance = 10000;

    public void withdraw(double amount) throws Exception {
        if (amount > balance) {
            throw new InsufficientBalanceException(balance, amount);
        }
        balance = balance - amount;
        System.out.println("Balance after withdrawal of " + amount + " is " + balance);
    }

    public static void main(String[] args) {
        Atm atm = new Atm();
        try {
            atm.withdraw(20000);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
