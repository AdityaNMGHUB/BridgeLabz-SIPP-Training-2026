import java.io.FileWriter;
import java.util.Scanner;

public class StudentData {

    public void addStudentData() {
        try {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter your ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter your Name: ");
            String name = sc.nextLine();

            System.out.print("Enter your Marks: ");
            int marks = sc.nextInt();

            FileWriter writer = new FileWriter("C:\\collage work\\BridgeLabz-SIPP-Training-2026\\core-java-practice\\practice problem\\Student.txt",true);

            writer.write("ID: " + id +"\nName: " + name +"\nMarks: " + marks +"\n-------------------\n");

            writer.close();

            System.out.println("Student added successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        StudentData data = new StudentData();
        data.addStudentData();
    }
}
