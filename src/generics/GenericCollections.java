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
        System.out.println();

        List<Number> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(1.0);
        System.out.println(list.get(0) instanceof Integer);
        System.out.println(list.get(0) instanceof Long);
        System.out.println(list.get(1) instanceof Float);
        System.out.println(list.get(1) instanceof Double);

        List<? super Integer> numbersGen = new ArrayList<>();
        numbersGen.add(1);
        numbersGen.add(1);
    }
}
