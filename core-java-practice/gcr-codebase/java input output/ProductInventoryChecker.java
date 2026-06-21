import java.io.*;

public class ProductInventoryChecker {
    public static void main(String[] args) {

        try {
            BufferedReader br = new BufferedReader(new FileReader("inventory.txt"));

            String line;

            while ((line = br.readLine()) != null) {

                String[] data = line.split("-");

                String productName = data[0];
                int quantity = Integer.parseInt(data[1]);

                if (quantity == 0) {
                    System.out.println(productName + " is out of stock");
                }
            }

            br.close();

        } catch (FileNotFoundException e) {
            System.out.println("Inventory file not found.");
        } catch (IOException e) {
            System.out.println("Error reading the file.");
        }
    }
}