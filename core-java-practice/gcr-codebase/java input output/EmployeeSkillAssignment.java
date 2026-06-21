import java.io.*;
import java.util.Scanner;

class Employee implements Serializable {
    int employeeId;
    String name;
    String department;
    double salary;

    Employee(int employeeId, String name, String department, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
}

public class EmployeeSkillAssignment {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Department: ");
        String department = sc.nextLine();

        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();

        Employee emp = new Employee(id, name, department, salary);

        // Serialization
        try {
            ObjectOutputStream oos =
                    new ObjectOutputStream(new FileOutputStream("employee.ser"));

            oos.writeObject(emp);
            oos.close();

            System.out.println("\nEmployee object serialized successfully.");

        } catch (IOException e) {
            System.out.println("Error during serialization.");
        }

        // Deserialization
        try {
            ObjectInputStream ois =
                    new ObjectInputStream(new FileInputStream("employee.ser"));

            Employee recoveredEmp = (Employee) ois.readObject();
            ois.close();

            System.out.println("\nRecovered Employee Information:");
            System.out.println("Employee ID : " + recoveredEmp.employeeId);
            System.out.println("Name        : " + recoveredEmp.name);
            System.out.println("Department  : " + recoveredEmp.department);
            System.out.println("Salary      : " + recoveredEmp.salary);

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error during deserialization.");
        }

        sc.close();
    }
}