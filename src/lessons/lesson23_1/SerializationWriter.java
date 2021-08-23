package lessons.lesson23_1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Path;

public class SerializationWriter {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("serializationDir", "test.out");
        Student student = new Student(19, "Anton", "Lohov", 11);
        Person person = new Person(22, "Sergey", "Popov");
        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(path.toFile()))){
            objectOutputStream.writeObject(student);
            objectOutputStream.writeObject(person);
        }
    }
}
