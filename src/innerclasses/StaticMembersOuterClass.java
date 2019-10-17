package innerclasses;

public class StaticMembersOuterClass {

    public static String name = "Outer";

    public class InnerClass {

        public final static int age = 0;

        public int getAge() {
            return age;
        }
    }

    public static class A {

        public class B {

            public final String name = "B";
            public void printOuterName() {
                System.out.println(StaticMembersOuterClass.name);
            }
        }
    }


    public static void main(String[] args) {

        InnerClass innerClass = new StaticMembersOuterClass().new InnerClass();
        System.out.println(innerClass.getAge());

        StaticMembersOuterClass.A a = new A();
        A.B b = new StaticMembersOuterClass.A().new B();
        System.out.println(b.name);
        b.printOuterName();
    }
}
