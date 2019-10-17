package inheritance;

public class InterfaceTest {
}

interface One {
    default String getId(){return "123";}
    //String getId();
}

interface Two extends One {
    String getId();
}
