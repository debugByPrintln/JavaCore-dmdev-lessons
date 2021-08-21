package lessons.lesson22_1;

import java.io.*;
import java.nio.file.Path;

public class WriterRunner {
    public static void main(String[] args) throws IOException {
        File file = Path.of("z_resources", "output.txt").toFile();
        try (BufferedWriter fileWriter = new BufferedWriter (new FileWriter(file, true))) {
            fileWriter.newLine();
            fileWriter.append("Hello");
        }
    }
}
