package streams_practic;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CombineAndSort {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple","banana","orange");
        List<String> vegetables = Arrays.asList("cucumber", "potato", "carrot");
        Stream.concat(fruits.stream(), vegetables.stream())
                .sorted()
                .forEach(System.out::println);
    }
}
