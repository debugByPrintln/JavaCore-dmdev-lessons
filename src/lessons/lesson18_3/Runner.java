package lessons.lesson18_3;

import lessons.lesson11_1.Point;

public class Runner {
    public static void main(String[] args) {
        Pair<String, Point> pair = new Pair<>("Hello, world", new Point(1, 2));
        System.out.println(pair);
        System.out.println(PairUtil.swap(pair));
    }

}
