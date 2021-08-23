package lessons.lesson23_1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Path;

public class SerializationWriter {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("serializationDir", "test.out");
        Person person = new Person(19, "Anton", "Lohov");
        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(path.toFile()))){
            objectOutputStream.writeObject(person);
        }
    }
}
