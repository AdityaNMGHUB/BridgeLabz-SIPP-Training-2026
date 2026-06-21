import java.util.Scanner;
public class TaxBracket{
    public static void main(String[] args) {
        double tax;
        double income;
        String tax_bracket=" ";

        Scanner sc = new Scanner(System.in);
        income = sc.nextDouble();

        if(income<=50000){
            tax = income*0.05;
            tax_bracket = "Tax of 5%";
        }else if(income<=10000){
            tax = income*0.10;
            tax_bracket = "tax of 10%";
        }
        System.out.println(income+"->"+tax_bracket);
    }
}
