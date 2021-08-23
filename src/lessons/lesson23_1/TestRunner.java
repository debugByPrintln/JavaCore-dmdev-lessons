package lessons.lesson23_1;

import java.io.*;
import java.nio.file.Path;

public class TestRunner {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Path path = Path.of("serializationDir", "test.out");
        Student student = null;
        try(ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(path.toFile()))){
            student = (Student) objectInputStream.readObject();
        }
        catch (Exception e){
            student = new Student(22, "Sergey", "Sosnov", 43434);
        }

        System.out.println(student.toString());

    }
}
