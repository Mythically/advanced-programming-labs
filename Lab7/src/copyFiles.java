import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class copyFiles {


    public static void iterate() throws IOException {
        File path = new File("./data");
        File[] directoryListing = path.listFiles();
        System.out.println(directoryListing);
        String fileType;
        if (directoryListing != null) {
            try {
                for (File file : directoryListing) {
                    Path getPath = Paths.get(file.toString());
                    Path newPath = Path.of(getPath.toString().replace("data", "dataOut"));
                    fileType = Files.probeContentType(getPath);
                    if (fileType.contains("text")) {
                        Files.copy(getPath, newPath);
                        System.out.printf("Copied new file: " + newPath);
                    }
                }
            }
            catch (IOException e) {
                System.out.println("Idk why we are catching it, since i'm not going to do anything in this case...");
                e.printStackTrace();
            }
        }
    }

}
