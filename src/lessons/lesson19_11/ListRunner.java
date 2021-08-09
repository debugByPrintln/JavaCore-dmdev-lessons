package lessons.lesson19_11;

import java.util.*;

public class ListRunner {
    public static void main(String[] args) {
        String[] array = new String[]{"this", "is", "lots", "of", "fun", "for", "every", "Java", "programmer"};
        List<String> list = new ArrayList<String>(Arrays.asList(array));

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() == 4){
                list.add(i , "****");
                i++;
            }
        }

        System.out.println(list);

    }
}
