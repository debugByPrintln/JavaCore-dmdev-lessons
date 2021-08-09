package lessons.lesson18_1;

import java.util.Arrays;
import java.util.Iterator;

public class MyList<T> implements Iterable<T>{

    private T[] objects;
    private int size;

    public MyList(int initialSize){
        this.objects = (T[]) new Object[initialSize];
    }

    public void add(T element){
        objects[size++] = element;
    }

    @Override
    public String toString() {
        return "MyList{" +
                "objects=" + Arrays.toString(objects) +
                '}';
    }

    public T get(int index){
        return objects[index];
    }

    public int getSize() {
        return size;
    }

    @Override
    public Iterator<T> iterator() {
        return new ListIterator();
    }

    private class ListIterator implements java.util.Iterator<T>{

        private int currentIndex;

        @Override
        public boolean hasNext() {
            return currentIndex < size;
        }

        @Override
        public T next() {
            return objects[currentIndex++];
        }
    }
}
