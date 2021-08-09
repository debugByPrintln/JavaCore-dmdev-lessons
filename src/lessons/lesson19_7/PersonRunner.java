package lessons.lesson19_7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PersonRunner {
    public static void main(String[] args) {

        Map<Integer, Person> map = new HashMap<>();

        Person ivan = new Person(1, "Ivan", "Ivanov");
        Person petr = new Person(2, "Petr", "Petrov");

        map.put(ivan.getId(), ivan);
        map.put(petr.getId(), petr);

        System.out.println(map);

    }
}
