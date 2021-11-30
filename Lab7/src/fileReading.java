import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class fileReading {

    public static void iterate() throws IOException {
        Scanner scanner;
        File path = new File("./data");
        File[] directoryListing = path.listFiles();
        try {
            if (directoryListing != null) {
                for (File file : directoryListing) {
                    Path getPath = Paths.get(file.toString());
                    scanner = new Scanner(getPath);
                    while (scanner.hasNextLine()) {
                        String line = scanner.nextLine();
                        if (line.charAt(0) == '+') {
                            System.out.println(line);
                        }
                    }
                }
            }
        }
        catch (IOException e) {
            System.out.println("Erra");
            e.printStackTrace();
        }
    }
}
