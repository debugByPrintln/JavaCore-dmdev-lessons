package lessons.lesson19_9;

import lessons.lesson19_7.Person;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Person ivan = new Person(1, "Ivan", "Ivanov");
        Person petr = new Person(2, "Petr", "Petrov");
        Person sveta = new Person(1, "Sveta", "Svetova");

        Map<Integer, Person> map = new HashMap<>();
        map.put(ivan.getId(), ivan);
        map.put(petr.getId(), petr);
        map.putIfAbsent(sveta.getId(), sveta);

//        System.out.println(map.keySet());
//        System.out.println(map.values());
//        System.out.println(map.entrySet());

        for (Map.Entry<Integer, Person> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "   " + entry.getValue().getFirstName() + "   " + entry.getValue().getLastName());
        }

    }
}
