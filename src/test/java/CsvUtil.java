import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class CsvUtil {
    private static final String CSV_FILE = "src/test/resources/credentials.csv";

    public static void writeCredentials(String email, String password) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(CSV_FILE))) {
            writer.println("email,password");
            writer.println(email + "," + password);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Map<String, String> readCredentials() {
        Map<String, String> credentials = new HashMap<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(CSV_FILE))) {
            String line = reader.readLine(); // Skip header
            if ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 2) {
                    credentials.put("email", parts[0]);
                    credentials.put("password", parts[1]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return credentials;
    }
}
