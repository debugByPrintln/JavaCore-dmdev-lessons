package lessons.lesson23_1;

import java.io.*;
import java.nio.file.Path;

public class TestRunner {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Path path = Path.of("serializationDir", "test.out");
        Person person = null;
        try(ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(path.toFile()))){
            person = (Person) objectInputStream.readObject();
        }
        catch (Exception e){
            person = new Person(22, "Sergey", "Sosnov");
        }

        System.out.println(person.toString());

    }
}
