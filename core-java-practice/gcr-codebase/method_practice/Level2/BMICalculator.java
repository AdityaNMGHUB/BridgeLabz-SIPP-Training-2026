import java.util.*;

public class BMICalculator {

    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double heightInMeters = data[i][1] / 100.0;
            data[i][2] = data[i][0] / (heightInMeters * heightInMeters);
        }
    }

    public static String[] getBMIStatus(double[][] data) {
        String[] status = new String[data.length];

        for (int i = 0; i < data.length; i++) {
            double bmi = data[i][2];

            if (bmi <= 18.4) {
                status[i] = "Underweight";
            } else if (bmi <= 24.9) {
                status[i] = "Normal";
            } else if (bmi <= 39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }

        return status;
    }

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            double[][] personData = new double[10][3];
            String[] bmiStatus;

            System.out.println("Enter Weight (kg) and Height (cm) for 10 persons:");

            for (int i = 0; i < 10; i++) {
                System.out.println("\nPerson " + (i + 1));

                System.out.print("Weight (kg): ");
                personData[i][0] = sc.nextDouble();

                System.out.print("Height (cm): ");
                personData[i][1] = sc.nextDouble();
            }

            calculateBMI(personData);

            bmiStatus = getBMIStatus(personData);

            System.out.println("\n----------------------------------------------");
            System.out.println("Weight\tHeight\tBMI\t\tStatus");
            System.out.println("----------------------------------------------");

            for (int i = 0; i < 10; i++) {
                System.out.printf("%.2f\t%.2f\t%.2f\t\t%s%n",
                        personData[i][0],
                        personData[i][1],
                        personData[i][2],
                        bmiStatus[i]);
            }
        }
    }
}