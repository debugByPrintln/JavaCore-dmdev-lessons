package lessons.lesson22_1;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilesRunner {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("z_resources", "files.txt");
        String collect = Files.lines(path)
                .collect(Collectors.joining(" "));
        System.out.println(collect);

    }
}
