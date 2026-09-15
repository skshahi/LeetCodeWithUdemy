package strings;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FilterEvenCharacter {

    public static void main(String[] args) {
        String str="sonu kumar";
        IntStream.range(0, str.length())
                .filter(i -> i % 2 != 0)
                .mapToObj(str::charAt)
                .forEach(System.out::print);
    }

}
