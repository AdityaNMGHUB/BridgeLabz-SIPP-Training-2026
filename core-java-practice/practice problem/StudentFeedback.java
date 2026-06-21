import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class StudentFeedback {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            BufferedReader reader = new BufferedReader(new InputStreamReader(null))
            int count = 0;
            System.out.println("enter 5 feedbacks : ");
            for(int i = 1; i<=5; i++){
                System.out.println("feedback "+i+":");
                String feedback = reader.readLine();
            }

            if(feedback.toLowerCase().contains("good")){
                counr++;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
