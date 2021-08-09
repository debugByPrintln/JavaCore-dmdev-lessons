package lessons.lesson18_1;

import lessons.lesson11_1.Point;

import java.util.Iterator;

public class Runner {
    public static void main(String[] args) {
        MyList<String> myList = new MyList<>(10);

        myList.add("1");
        myList.add("2");
        myList.add("3");
        myList.add("4");
        myList.add("5");
        myList.add("6");

        Iterator<String> iterator = myList.iterator();

        while (iterator.hasNext()){
            String currentElement = iterator.next();

            System.out.println(currentElement.endsWith("4"));
        }
    }
}
