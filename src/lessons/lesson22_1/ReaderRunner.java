package lessons.lesson22_1;

import java.io.*;
import java.nio.file.Path;
import java.util.*;
import java.util.stream.Collectors;

public class ReaderRunner {
    public static void main(String[] args) throws IOException {
        File file = Path.of("z_resources", "some_file.txt").toFile();

        try (BufferedReader bufferedFileReader = new BufferedReader(new FileReader(file))) {

            String collect = bufferedFileReader.lines()
                    .collect(Collectors.joining(" "));

            collect = collect.replace(".", "");

            List<String> list = new LinkedList<>(Arrays.asList(collect.split(" ")));

            Set<String> set = new LinkedHashSet<>(list);

            System.out.println(list + "\n" + set);
        }
    }
}
