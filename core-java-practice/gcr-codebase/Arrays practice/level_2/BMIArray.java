import java.util.Scanner;

public class BMIArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();

        double[] weight = new double[n];
        double[] height = new double[n];
        double[] bmi = new double[n];
        String[] status = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter weight (kg) of person " + (i + 1) + ": ");
            weight[i] = sc.nextDouble();

            System.out.print("Enter height (cm) of person " + (i + 1) + ": ");
            height[i] = sc.nextDouble();
        }

        for (int i = 0; i < n; i++) {
            double heightInMeter = height[i] / 100;

            bmi[i] = weight[i] / (heightInMeter * heightInMeter);

            if (bmi[i] <= 18.4) {
                status[i] = "Underweight";
            } else if (bmi[i] <= 24.9) {
                status[i] = "Normal";
            } else if (bmi[i] <= 39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }

        System.out.println("\nPerson Details:");

        for (int i = 0; i < n; i++) {
            System.out.println("Person " + (i + 1));
            System.out.println("Height = " + height[i] + " cm");
            System.out.println("Weight = " + weight[i] + " kg");
            System.out.println("BMI = " + bmi[i]);
            System.out.println("Status = " + status[i]);
            System.out.println();
        }

        sc.close();
    }
}