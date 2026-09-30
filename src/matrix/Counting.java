package matrix;

import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Counting {
    public static void main(String[] args) {
        String str="hi hello welcome bye hi  hello hi";
        Optional<Map.Entry<String, Long>> first = Stream.of(str.split(" ")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().sorted(Comparator.comparing(Map.Entry::getValue, Comparator.reverseOrder())).skip(1).findFirst();

        System.out.println(first.get().getKey());
    }
}
