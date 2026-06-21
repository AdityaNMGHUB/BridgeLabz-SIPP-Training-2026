import java.io.*;
import java.util.*;

public class SchoolResultPortal {
    public static void main(String[] args) {

        String inputFile = "students.txt";
        String outputFile = "reportcard.txt";

        try {
            Scanner fileReader = new Scanner(new File(inputFile));

            // true = append mode
            FileWriter writer = new FileWriter(outputFile, true);

            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();

                String[] data = line.split(",");

                String name = data[0];
                int mark1 = Integer.parseInt(data[1]);
                int mark2 = Integer.parseInt(data[2]);
                int mark3 = Integer.parseInt(data[3]);

                double average = (mark1 + mark2 + mark3) / 3.0;

                writer.write("Student Name : " + name + "\n");
                writer.write("Marks        : " + mark1 + ", " + mark2 + ", " + mark3 + "\n");
                writer.write("Average      : " + average + "\n");
                writer.write("---------------------------------\n");
            }

            fileReader.close();
            writer.close();

            System.out.println("Report card generated successfully.");

        } catch (FileNotFoundException e) {
            System.out.println("Error: Student data file not found.");
        } catch (IOException e) {
            System.out.println("Error while writing report card.");
        }
    }
}