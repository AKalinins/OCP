package exceptions;

public class TryCatchFinally {

    public static void main(String[] args) {

        try {
            System.out.println("Try block.");
            throw new UnsupportedOperationException();
        } catch (UnsupportedOperationException uoe) {
            System.out.println("First catch.");
            throw new RuntimeException();
        } catch (RuntimeException rte) {
            System.out.println("Second catch.");
            throw new RuntimeException();
        } finally {
            System.out.println("Finally.");
        }
    }
}
