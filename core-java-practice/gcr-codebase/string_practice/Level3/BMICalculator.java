import java.util.*;

class BMICalculator {

    static String getStatus(double bmi) {

        if (bmi < 18.5)
            return "Underweight";
        else if (bmi < 25)
            return "Normal";
        else if (bmi < 30)
            return "Overweight";
        else
            return "Obese";
    }

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            double[][] person = new double[10][2];

            for (int i = 0; i < 10; i++) {

                System.out.print("Weight (kg): ");
                person[i][0] = sc.nextDouble();

                System.out.print("Height (cm): ");
                person[i][1] = sc.nextDouble();
            }

            System.out.println("\nWeight\tHeight\tBMI\tStatus");

            for (int i = 0; i < 10; i++) {

                double weight = person[i][0];
                double height = person[i][1] / 100.0;

                double bmi = weight / (height * height);

                System.out.printf("%.1f\t%.1f\t%.2f\t%s\n",
                        person[i][0],
                        person[i][1],
                        bmi,
                        getStatus(bmi));
            }
        }
    }
}