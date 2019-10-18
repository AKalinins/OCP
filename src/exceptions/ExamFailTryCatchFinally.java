package exceptions;

public class ExamFailTryCatchFinally {

    public static void doStuff(String s) {

        try {
            if (s == null) {
                throw new NullPointerException();
            }
        } finally {
            System.out.println("Finally");
        }
    }

    public static void main(String[] args) {

        try {
            doStuff(null);
        } catch (NullPointerException npe) {
            System.out.println("Catch");
        }
        System.out.println("Do stuff");
    }
}
