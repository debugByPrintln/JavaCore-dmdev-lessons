package lessons.lesson22_1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Path;

public class InputStreamRunner {
    public static void main(String[] args) throws IOException {
        File file = Path.of("z_resources", "some_file.txt").toFile();
        try(FileInputStream inputStream = new FileInputStream(file)){

            byte[] bytes = inputStream.readAllBytes();
            String s = new String(bytes);
            System.out.print(s);
        }
    }
}
