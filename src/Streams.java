import java.util.function.Predicate;
import java.util.stream.Stream;

public class Streams {

    public static void main(String[] args) {

        Stream<String> wolf = Stream.of("w", "o", "l", "f");
        StringBuilder sb = wolf.collect(StringBuilder::new, StringBuilder::append, StringBuilder::append);
        System.out.println(sb.toString());

        Stream<String> str = Stream.of("123", "1234", "12345", "123456");
        Stream<Integer> intStream = str.filter(s -> s.length() > 3).map(String::length);
        intStream.forEach(System.out::println);

        Stream<String> names = Stream.of("Sarah Adams", "Suzy Pinnell", "Paul Basgall");
        Stream<String> firstNames = names.map(e -> e.split(" ")[0]);


    }
}
