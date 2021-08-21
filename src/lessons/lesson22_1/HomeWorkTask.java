package lessons.lesson22_1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class HomeWorkTask {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("z_resources", "homework.txt");
        Path path2 = Path.of("z_resources", "numbers.txt");
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


//        //2 task
//        ArrayList<String> task2List = new ArrayList<>(Arrays.asList(collect.split(" ")));
//        task2List.stream()
//                .map(String::toLowerCase)
//                .filter(HomeWorkTask::checkStartsAndEndsWith)
//                .forEach(System.out::println);


//        //3 task
//        Files.write(path2, List.of("123", "232323", "32312 3213 32", "323 322 32312312"));
//        List<String> task3List = Files.lines(path2)
//                .collect(Collectors.toList());
//        for (String s : task3List) {
//            if (isInt(s)){
//                System.out.println(s);
//            }
//            else {
//                String[] split = s.split(" ");
//                int max = 0;
//                for (String splitString : split) {
//                    if (Integer.parseInt(splitString) > max){
//                        max = Integer.parseInt(splitString);
//                    }
//                }
//                System.out.println(max);
//            }
//        }


//        //4 task
//        Path input = Path.of("z_resources", "publicToPrivate.txt");
//        Path output = Path.of("z_resources", "output.txt");
//
//        String s = Files.readString(input);
//        s = s.replaceAll("public", "private");
//        Files.writeString(output, s);


        //5 task
        Path input = Path.of("z_resources", "publicToPrivate.txt");
        Path output = Path.of("z_resources", "output.txt");

        List<String> list = Files.readAllLines(input);

        String s = list.stream()
                .map(StringBuilder::new)
                .map(StringBuilder::reverse)
                .collect(Collectors.joining(System.lineSeparator()));

        Files.writeString(output, s);
    }

    private static boolean checkFirstLetter(String s){
        char[] chars = s.toCharArray();
        return chars[0] == 'а' ||
                chars[0] == 'я' ||
                chars[0] == 'и' || chars[0] == 'у' ||
                chars[0] == 'е' || chars[0] == 'ю' || chars[0] == 'э' || chars[0] == 'о' || chars[0] == 'ы';
    }

    private static boolean checkStartsAndEndsWith(String s){
        char[] chars = s.toCharArray();
        if (s.length() <= 1){
            return false;
        }
        return chars[0] == chars[s.length()-1];
    }

    private static boolean isInt(String s){
        try {
            Integer.parseInt(s);
            return true;
        }
        catch (Exception e){
            return false;
        }
    }

}
