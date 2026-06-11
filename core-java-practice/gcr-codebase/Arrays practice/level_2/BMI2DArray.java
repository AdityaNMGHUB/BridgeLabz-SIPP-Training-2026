import java.util.Scanner;

public class BMI2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int number = sc.nextInt();

        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];

        for (int i = 0; i < number; i++) {

            System.out.print("Enter weight (kg) of person " + (i + 1) + ": ");
            personData[i][0] = sc.nextDouble();

            System.out.print("Enter height (cm) of person " + (i + 1) + ": ");
            personData[i][1] = sc.nextDouble();

            if (personData[i][0] <= 0 || personData[i][1] <= 0) {
                System.out.println("Invalid Input! Enter positive values.");
                i--;
            }
        }

        for (int i = 0; i < number; i++) {

            double heightInMeter = personData[i][1] / 100;

            personData[i][2] = personData[i][0] / (heightInMeter * heightInMeter);

            if (personData[i][2] <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (personData[i][2] <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        System.out.println("\nPerson Details:");

        for (int i = 0; i < number; i++) {
            System.out.println("Person " + (i + 1));
            System.out.println("Weight = " + personData[i][0] + " kg");
            System.out.println("Height = " + personData[i][1] + " cm");
            System.out.println("BMI = " + personData[i][2]);
            System.out.println("Status = " + weightStatus[i]);
            System.out.println();
        }

        sc.close();
    }
}