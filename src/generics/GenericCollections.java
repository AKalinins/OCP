package generics;

import java.util.ArrayList;
import java.util.List;

public class GenericCollections {

    public static void main(String[] args) {

        List list = new ArrayList<>();
        list.add("123");
        list.add(123); //Autoboxing to Integer and Object
        System.out.println(list.get(1) instanceof Number);
        System.out.println(list.get(1) instanceof Integer);
        System.out.println(list.get(1) instanceof Object);
        System.out.println(list);
    }
}
