package streams_practic;

import java.util.stream.Stream;

public class EvenNumberFilter {
    public static void main(String[] args) {
        Stream.of(1,2,3,4,5,6,7,8,9).filter(element -> element % 2 == 0).forEach(System.out::println);
    }
}
