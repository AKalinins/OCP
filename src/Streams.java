import java.util.stream.Stream;

public class Streams {

    public static void main(String[] args) {

        Stream<String> wolf = Stream.of("w", "o", "l", "f");
        StringBuilder sb = wolf.collect(StringBuilder::new, StringBuilder::append, StringBuilder::append);
        System.out.println(sb.toString());
    }
}
