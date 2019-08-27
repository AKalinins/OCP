import java.util.function.Predicate;

public class MethodReference {

    public static void main(String[] args) {

        String abc = "abc";

        Predicate<String> met = abc::startsWith;
        boolean m = met.test("a");
        System.out.println(m);

        Predicate<String> lam = s -> s.startsWith("s");
        boolean l = lam.test(abc);
        System.out.println(l);
    }
}
