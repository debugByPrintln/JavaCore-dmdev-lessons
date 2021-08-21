package lessons.lesson22_1;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;

public class OutputRunner {
    public static void main(String[] args) throws IOException {
        File file = Path.of("z_resources", "output.txt").toFile();
        try (BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(file, true))) {
            outputStream.write("Hello, world!".getBytes(StandardCharsets.UTF_8));
        }
    }
}
