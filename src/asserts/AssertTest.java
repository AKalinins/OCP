package asserts;

public class AssertTest {

    public static void test(int i) {
        assert i > 0 : "Assert";
    }

    public static void main(String[] args) {
        test(1);
    }
}
