package streams_practic;

import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Задача: Дан список слов. Необходимо посчитать количество повторений каждого слова и вывести результат.
public class StreamsPractic {
    public static void main(String[] args) {
        Stream.of("Apple", "Banana", "Pineapple", "Strawberry", "Banana", "Banana", "Apple")
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .forEach((word, count) -> System.out.println(word + " " + count));
    }
}
