package multiplecatch;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;

public class MultiCatchPipe {
    public static void main(String[] args) {
        try {
            // Attempt to open and read from a file
            BufferedReader br = new BufferedReader(new FileReader("src/main/data.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
            // Simulate a database operation that could throw SQLException
            simulateDatabaseOperation();
        } catch (IOException | SQLException e) {
            // Handle both IOException and SQLException
            System.err.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }

    // A method to simulate a database operation that throws SQLException
    public static void simulateDatabaseOperation() throws SQLException {
        throw new SQLException("Simulated database error");
    }
}
