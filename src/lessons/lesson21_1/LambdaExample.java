package lessons.lesson21_1;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class LambdaExample {
    public static void main(String[] args) {
//        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6, 7);
//        integers.stream()
//                .map((Integer value) -> value + value)
//                .map(String::valueOf)
//                .skip(1)
//                .limit(3)
//                .forEach((String value) -> System.out.println(value + " SE 8"));

//        Integer optional = Stream.of("1", "4", "10")
//                .map(Integer::valueOf)
//                .map(TestUtils::minusTwo)
//                .filter(value -> value >= 0)
//                .reduce((value1, value2) -> value1*value2)
//                .get();




        //First task:
        double d = IntStream.of(1, 5, 10, 15, 17, 25, 35, 32)
                .filter(value -> value % 2 != 0 && value % 5 == 0)
                .average()
                .getAsDouble();

        System.out.println("1 task: " + d);


        //Second task:
        List<String> list = new ArrayList<>();
        list.add("Hello"); list.add("abcdefghjiomnlp"); list.add("rerererererere"); list.add("rerererererere");
        Set<String> set = new HashSet<>(list);
//        System.out.println(list + "\n" + set);



        long count = set.stream()
                .filter(value -> value.length() >= 8)
                .count();

        System.out.println("2 task: " + count);

        //Third task:
        Map<String, Integer> map = new HashMap<>();
        map.put("asd", 1); map.put("dfc", 2); map.put("qwertyasdfghj", 3);
        int sum = map.entrySet().stream()
                .filter(value -> value.getKey().length() <= 3)
                .map(Map.Entry::getValue)
                .mapToInt(Integer::valueOf)
                .sum();

        System.out.println("3 task: " + sum);

        //Fourth task:
        List<Integer> integerList = Stream.of(5, 2, 4, 2, 1)
                .collect(Collectors.toList());

        String s = integerList.stream()
                .map(String::valueOf)
                .reduce(String::concat)
                .get();

        System.out.println("4 task: " + s);


        List<Person> personList = Stream.of(
                new Person("Ivan", "Ivanov", 19),
                new Person("Vladimir", "Starodubcev", 29),
                new Person("Leha", "Pidoras", 13),
                new Person("Andrey", "FeederNaJugger", 19),
                new Person("d", "Petrov", 19)
        )
                .collect(Collectors.toList());

        Person person = personList.stream()
                .filter(value -> (value.getLastName().length() + value.getFirstName().length()) >= 15)
                .max((left, right) -> new ComparatorByAge().compare(left, right))
                .get();

        System.out.println(person);

//        List<Student> l = Stream.of(
//                        new Student("A", "B", 1, 1),
//                        new Student("C", "B", 1, 1)
//                )
//                .peek(value -> value.setAge(2))
//                .collect(Collectors.toList());
//
//        System.out.println(l);
//
//        l.add(new Student("T", "t", 5, 5));
//
//        System.out.println(l);
    }

    private static class ComparatorByAge implements Comparator<Person> {

        @Override
        public int compare(Person o1, Person o2) {
            return Integer.compare(o1.getAge(), o2.getAge());
        }
    }
}
