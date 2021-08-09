package lessons.lesson19_9;

import com.sun.nio.sctp.PeerAddressChangeNotification;
import lessons.lesson19_7.Person;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortExample {
    public static void main(String[] args) {
        List<Person> personList = Arrays.asList(
                new Person(59, "Ivan", "A"),
                new Person(29, "Petr", "D"),
                new Person(3, "Sveta", "H")
        );


        Collections.sort(personList);
        System.out.println(personList);

        Collections.sort(personList, new CompareByLastName());

        System.out.println(personList);
    }

    private static class CompareByLastName implements Comparator<Person>{

        @Override
        public int compare(Person o1, Person o2) {
            return o1.getLastName().compareTo(o2.getLastName());
        }
    }
}
