package lessons.lesson22_1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class HomeWorkTask {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("z_resources", "homework.txt");
        String collect = Files.lines(path).collect(Collectors.joining(" "));
        collect = collect.replace(".", "");
        collect = collect.replace(",", "");
        collect = collect.replace("?", "");
        collect = collect.replace("!", "");
        collect = collect.replace(":", "");


        //1 task
//        ArrayList<String> task1List = new ArrayList<>(Arrays.asList(collect.split(" ")));
//        task1List.stream()
//                .map(value -> value.toLowerCase(Locale.ROOT))
//                .filter(HomeWorkTask1::checkFirstLetter)
//                .forEach(System.out::println);


        //2 task
        ArrayList<String> task2List = new ArrayList<>(Arrays.asList(collect.split(" ")));
        task2List.stream()
                .map(String::toLowerCase)
                .filter(HomeWorkTask::checkStartsAndEndsWith)
                .forEach(System.out::println);

    }

    private static boolean checkFirstLetter(String s){
        char[] chars = s.toCharArray();
        return chars[0] == 'а' || chars[0] == 'я' || chars[0] == 'и' || chars[0] == 'у' || chars[0] == 'е' || chars[0] == 'ю' || chars[0] == 'э' || chars[0] == 'о' || chars[0] == 'ы';
    }

    private static boolean checkStartsAndEndsWith(String s){
        char[] chars = s.toCharArray();
        if (s.length() == 0){
            return false;
        }
        return chars[0] == chars[s.length()-1];
    }
}