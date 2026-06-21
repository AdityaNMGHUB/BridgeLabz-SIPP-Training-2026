import java.util.*;
public class metro {
    public static void main(String[] args) {
        double balance=600.0;
        System.out.println("enter number of passanger : ");
        Scanner sc = new Scanner(System.in);
        int passanger = sc.nextInt();
        while(balance>0){
            System.out.println("enter distance in km or Type-1 to exit: ");
            double distance=sc.nextDouble();
            if(distance==-1){
                break;
            }
            //fare calculation
            double fare=(distance<=5) ? 10:(distance<=10) ? 20:(distance<=20)?30:50;

            //balance calculation
            if(balance>fare){
                System.out.println("");
                fare*=passanger;
                balance-=fare;
                System.out.println("Available balance in your card:  "+balance);
            }
            else{
                System.out.println("Insufficient Balance Please Check your balance ");

            }
              System.out.println("--------Delhi metro me aapka swagat hai--------");
        }    
      
    }
}