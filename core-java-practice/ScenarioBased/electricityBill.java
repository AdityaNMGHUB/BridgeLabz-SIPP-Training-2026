import java.util.Scanner;
public class electricityBill{
    double units;


        //bill calculation
    public double electricityBill(double units){
        double amount=(units<=50)?5:(units<=100)?10:(units<=200)?15:(units<=300)?20:30;
        return amount;
        
    }
    public void generateBill(double units, double amount){
        System.out.println("Electricity Bill");
        System.out.println("Units Consumed: "+units);
        System.out.println("Amount to be paid: "+amount);
    }
    public static void main(String[] args){
        electricityBill bill = new electricityBill();
        Scanner sc = new Scanner(System.in);
        bill.units = sc.nextDouble();
        double amount = bill.electricityBill(bill.units);
        bill.generateBill(bill.units, amount);
    }
}