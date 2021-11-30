import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class fileURL {

    public static void iterate() throws IOException {
        Scanner scanner;
        File file = new File("./poke.txt");
        BufferedWriter writer = new BufferedWriter(new FileWriter(file));

        try {
            URL url = new URL("https://pokeapi.co/");
            scanner = new Scanner(url.openStream());
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                writer.write(line);


            }
            writer.close();
        }
        catch (IOException e) {
            System.out.println("I tried");
            e.printStackTrace();
        }
    }
}
