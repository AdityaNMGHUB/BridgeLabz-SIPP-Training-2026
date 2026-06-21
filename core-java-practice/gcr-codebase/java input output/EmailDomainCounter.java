import java.io.*;

public class EmailDomainCounter {
    public static void main(String[] args) {

        String[] domains = new String[100];
        int count = 0;

        try {
            BufferedReader br = new BufferedReader(new FileReader("emails.txt"));

            String email;

            while ((email = br.readLine()) != null) {

                int atIndex = email.indexOf('@');
                String domain = email.substring(atIndex + 1);

                domains[count++] = domain;
            }

            br.close();

            int gmailCount = 0;
            int yahooCount = 0;
            int otherCount = 0;

            for (int i = 0; i < count; i++) {
                if (domains[i].equalsIgnoreCase("gmail.com")) {
                    gmailCount++;
                } else if (domains[i].equalsIgnoreCase("yahoo.com")) {
                    yahooCount++;
                } else {
                    otherCount++;
                }
            }

            System.out.println("Gmail Users = " + gmailCount);
            System.out.println("Yahoo Users = " + yahooCount);
            System.out.println("Other Users = " + otherCount);

        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } catch (IOException e) {
            System.out.println("Error reading file.");
        }
    }
}