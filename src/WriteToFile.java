import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WriteToFile {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        File file = new File("someFile");

        PrintWriter pw = null;
        try {
            pw = new PrintWriter(file);
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }

        pw.println("Hello, World!");
        pw.println("Goodbye, World!");

        pw.close();
    }
}
