package lessons.lesson23_1;

import java.io.*;
import java.nio.file.Path;

public class TestRunner {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Path path = Path.of("serializationDir", "test.out");
        Student student = null;
        Person person = null;
        try(ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(path.toFile()))){
            student = (Student) objectInputStream.readObject();
            person = (Person) objectInputStream.readObject();
        }
        catch (Exception e){
            e.printStackTrace();
        }

        if (student != null) {
            System.out.println(student.toString());
            System.out.println(person.toString());
        }

    }
}
