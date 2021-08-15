package lessons.lesson19_15;

import java.util.*;
import java.util.stream.IntStream;

public class Runner {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(1); list.add(2); list.add(3); list.add(4); list.add(5); list.add(6); list.add(8); list.add(8); list.add(8);

        Map<String, String> map = new HashMap<>();
        map.put("1", "A"); map.put("2", "A"); map.put("3", "C"); map.put("4", "D"); map.put("5", "E");

//        System.out.println(isUnique(map));
//        System.out.println(removeAllOdds(list));

        Map<Integer, Integer> palindrome1 = new TreeMap<>();
        Map<Integer, Integer> palindrome2 = new TreeMap<>();

        palindrome1.put(2, 2); palindrome1.put(1, 3); palindrome1.put(0, 6); palindrome1.put(3, 2);
        palindrome2.put(2, 3); palindrome2.put(1, 4); palindrome2.put(0, 6); palindrome2.put(4, 2); palindrome2.put(3, 2);

        System.out.println(palindrome1 + "\n" + palindrome2);
        System.out.println(sumOfPalindromes(palindrome1, palindrome2));

    }

    private static List<Integer> removeAllOdds(List<Integer> list){
        list.removeIf(currentInteger -> currentInteger % 2 == 0);
        return list;
    }

    private static int countUnique(List<Integer> list){
        return new HashSet<>(list).size();
    }

    private static boolean isUnique(Map<String, String> map){
        List<String> valuesList = new ArrayList<>(map.values());

        Set<String> set = new HashSet<>(valuesList);

        return valuesList.size() == set.size();
    }

    private static Map<Integer, Integer> sumOfPalindromes(Map<Integer, Integer> p1, Map<Integer, Integer> p2){
        Map<Integer, Integer> resultMap = new TreeMap<>();
        Set<Map.Entry<Integer, Integer>> entrySet1 = p1.entrySet();
        Set<Map.Entry<Integer, Integer>> entrySet2 = p2.entrySet();
        Integer maxPower1 = 0;
        Integer maxPower2 = 0;
        for (Map.Entry<Integer, Integer> entry : entrySet1) {
            if (entry.getKey() > maxPower1){
                maxPower1 = entry.getKey();
            }
        }
        for (Map.Entry<Integer, Integer> entry : entrySet2) {
            if (entry.getKey().intValue() > maxPower2.intValue()){
                maxPower2 = entry.getKey();
            }
        }

        if (maxPower1 >= maxPower2){
            for (Map.Entry<Integer, Integer> entry : entrySet1) {
                Integer key = entry.getKey();
                Integer value = entry.getValue() + p2.getOrDefault(key, 0);
                resultMap.put(key, value);
            }
        }

        else {
            for (Map.Entry<Integer, Integer> entry : entrySet2) {
                Integer key = entry.getKey();
                Integer value = entry.getValue() + p1.getOrDefault(key, 0);
                resultMap.put(key, value);
            }
        }


        return resultMap;
    }

}
