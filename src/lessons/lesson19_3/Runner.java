package lessons.lesson19_3;

import java.util.*;

public class Runner {
    public static void main(String[] args) {
        String s1 = "ABC";
        String s2 = "DSE";

        System.out.println(s1.compareTo(s2));

        List<String> s = new ArrayList<>();
        s.add(s2);
        s.add(s1);
        System.out.println(s);
        Collections.sort(s);
        System.out.println(s);

//        System.out.println(Arrays.toString(integerList.toArray()));


    }
}
