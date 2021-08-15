package lessons.lesson22_1;

import lessons.lesson19_11.Student;

import java.io.File;
import java.io.IOException;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileRunner {
    public static void main(String[] args) {

        File file = new File("z_resources/some_file.txt");

        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

//        System.out.println(file.exists() + "\n" + file.isFile());
//        System.out.println(file.canExecute());
//        System.out.println(file.canWrite());
//        System.out.println(file.canRead());

        List<Student> students = Stream.of(
                new Student("A", "A", 10, 14),
                new Student("A", "A", 14, 14),
                new Student("A", "A", 9, 14),
                new Student("A", "A", 19, 14),
                new Student("A", "A", 3, 14)
        )
                .collect(Collectors.toList());

        students.stream()
                .forEach((Student s) -> System.out.print(s.getAge() + " "));

        System.out.println();

        Comparator<Student> comparator = ((Student s1, Student s2) -> Integer.compare(s1.getAge(), s2.getAge()));

        students.sort(comparator);

        students.stream()
                .forEach((Student s) -> System.out.print(s.getAge() + " "));
    }
}
