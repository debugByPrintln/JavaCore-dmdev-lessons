package lessons.lesson23_1;

import java.io.*;
import java.nio.file.Path;

public class SerializationDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Path path = Path.of("serializationDir", "person.out");
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(path.toFile()))) {
            Person sergey = new Person(19, "Sergey", "Lohov");
            Person anton = new Person(19, "Anton", "Lohov");
            Person pasha = new Person(19, "Pasha", "Lohov");
            objectOutputStream.writeObject(sergey);
            objectOutputStream.writeObject(anton);
            objectOutputStream.writeObject(pasha);
        }

        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(path.toFile()))) {
            Object object = (Person) objectInputStream.readObject();
            Object object2 = (Person) objectInputStream.readObject();
            Object object3 = (Person) objectInputStream.readObject();
            System.out.println(object.toString() + "\n" + object2.toString() + "\n" + object3.toString());
        }
    }
}
