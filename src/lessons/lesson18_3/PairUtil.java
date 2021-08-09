package lessons.lesson18_3;

public final class PairUtil {
    public static <K, V> Pair<V, K> swap(Pair<K, V> pair){
        V second = pair.getSecond();
        K first = pair.getFirst();
        return new Pair<>(second, first);
    }
}
